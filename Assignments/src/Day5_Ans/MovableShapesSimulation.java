package Day5_Ans;


interface Movable {
 void moveUp();
 void moveDown();
 void moveLeft();
 void moveRight();
}

class MovablePoint implements Movable {
 int x, y;     
 int xSpeed, ySpeed;

 public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
     this.x = x;
     this.y = y;
     this.xSpeed = xSpeed;
     this.ySpeed = ySpeed;
 }

 @Override
 public void moveUp() {
     y += ySpeed;
 }

 @Override
 public void moveDown() {
     y -= ySpeed;
 }

 @Override
 public void moveLeft() {
     x -= xSpeed;
 }

 @Override
 public void moveRight() {
     x += xSpeed;
 }

 @Override
 public String toString() {
     return "Point(" + x + ", " + y + "), Speed(" + xSpeed + ", " + ySpeed + ")";
 }
}

class MovableCircle implements Movable {
 int radius;
 MovablePoint center; 

 public MovableCircle(int radius, MovablePoint center) {
     this.radius = radius;
     this.center = center;
 }

 @Override
 public void moveUp() {
     center.moveUp();
 }

 @Override
 public void moveDown() {
     center.moveDown();
 }

 @Override
 public void moveLeft() {
     center.moveLeft();
 }

 @Override
 public void moveRight() {
     center.moveRight();
 }

 @Override
 public String toString() {
     return "Circle[Radius=" + radius + ", Center=" + center + "]";
 }
}

class MovableRectangle implements Movable {
 MovablePoint topLeft;
 MovablePoint bottomRight;

 public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
     if (topLeft.xSpeed != bottomRight.xSpeed || topLeft.ySpeed != bottomRight.ySpeed) {
         throw new IllegalArgumentException("Both points must have the same speed");
     }
     this.topLeft = topLeft;
     this.bottomRight = bottomRight;
 }

 @Override
 public void moveUp() {
     topLeft.moveUp();
     bottomRight.moveUp();
 }

 @Override
 public void moveDown() {
     topLeft.moveDown();
     bottomRight.moveDown();
 }

 @Override
 public void moveLeft() {
     topLeft.moveLeft();
     bottomRight.moveLeft();
 }

 @Override
 public void moveRight() {
     topLeft.moveRight();
     bottomRight.moveRight();
 }

 @Override
 public String toString() {
     return "Rectangle[TopLeft=" + topLeft + ", BottomRight=" + bottomRight + "]";
 }
}

public class MovableShapesSimulation {
 public static void main(String[] args) {
     MovablePoint p1 = new MovablePoint(0, 0, 2, 2);
     System.out.println("initial point: " + p1);
     p1.moveRight();
     p1.moveUp();
     System.out.println("after moving: " + p1);

     MovableCircle circle = new MovableCircle(5, new MovablePoint(1, 1, 3, 3));
     System.out.println("initial circle: " + circle);
     circle.moveUp();
     circle.moveLeft();
     System.out.println("after moving: " + circle);

     MovableRectangle rectangle = new MovableRectangle(
             new MovablePoint(0, 0, 1, 1),
             new MovablePoint(5, -5, 1, 1)
     );
     System.out.println("initial rectangle: " + rectangle);
     rectangle.moveDown();
     rectangle.moveRight();
     System.out.println("after moving: " + rectangle);
 }
}
