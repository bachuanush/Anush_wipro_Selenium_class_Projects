package Day5_Ans;

interface Polygon {
 double getArea();

 default double getPerimeter(int... sides) {
     double perimeter = 0;
     for (int side : sides) {
         perimeter += side;
     }
     return perimeter;
 }

 static String shapeInfo() {
     return "Polygon";
 }
}

class Rectangle1 implements Polygon {
 private double length;
 private double width;

 Rectangle1(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 public double getArea() {
     return length * width;
 }
}

class Triangle implements Polygon {
 private double base;
 private double height;

 Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }

 @Override
 public double getArea() {
     return 0.5 * base * height;
 }
}

public class Main3 {
 public static void main(String[] args) {
     Rectangle1 rect = new Rectangle1(10, 5);
     Triangle tri = new Triangle(6, 4);

     System.out.println("rectangle area: " + rect.getArea());
     System.out.println("rectangle perimeter: " + rect.getPerimeter(10, 5, 10, 5));

     System.out.println("triangle area: " + tri.getArea());
     System.out.println("Ttriangle perimeter: " + tri.getPerimeter(6, 4, 5));

     System.out.println(Polygon.shapeInfo());
 }
}
