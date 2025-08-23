package Day4_Ans;


interface Drawable {
 void draw();
}

abstract class Shape1 implements Drawable {
 abstract double area();
}

class Circle1 extends Shape1 {
 private double radius;

 public Circle1(double radius) {
     this.radius = radius;
 }

 @Override
 double area() {
     return Math.PI * radius * radius;
 }

 @Override
 public void draw() {
     System.out.println("drawing a circle of radius " + radius);
 }
}

class Rectangle1 extends Shape1 {
 private double length, width;

 public Rectangle1(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 double area() {
     return length * width;
 }

 @Override
 public void draw() {
     System.out.println("drawing a rectangle of length " + length + " and width " + width);
 }
}

class Triangle1 extends Shape1 {
 private double base, height;

 public Triangle1(double base, double height) {
     this.base = base;
     this.height = height;
 }

 @Override
 double area() {
     return 0.5 * base * height;
 }

 @Override
 public void draw() {
     System.out.println("drawing a triangle of base " + base + " and height " + height);
 }
}

public class ShapeDemo {
 public static void main(String[] args) {
     Shape1[] shapes = {
         new Circle1(5),
         new Rectangle1(4, 6),
         new Triangle1(3, 7)
     };

     for (Shape1 sp : shapes) {
         sp.draw();
         System.out.println("Area: " + sp.area());
         System.out.println("**********************");
     }
 }
}
