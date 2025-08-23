package Day4_Ans;



class Shape {
 void area() {
     System.out.println("area");
 }
}

class Circle extends Shape {
 double radius;

 Circle(double radius) {
     this.radius = radius;
 }

 @Override
 void area() {
     double result = 3.14 * radius * radius;
     System.out.println("circle area: " + result);
 }
}

class Rectangle extends Shape {
 double length, width;

 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 void area() {
     double result = length * width;
     System.out.println("rectangle area: " + result);
 }
}

public class Shapes {
 public static void main(String[] args) {
     Shape obj = new Shape();
     obj.area();

     Shape obj1 = new Circle(5);
     obj1.area();

     Shape obj2 = new Rectangle(4, 6);
     obj2.area();
 }
}
