package Day5_Ans;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("width and height must positive");
        }
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("width must positive.");
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("height must positive.");
        }
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void displayDetails() {
        System.out.println("rectangle:");
        System.out.println("width: " + width);
        System.out.println("height: " + height);
        System.out.println("area: " + getArea());
        System.out.println("perimeter: " + getPerimeter());
    }

    public static void main(String[] args) {
        try {
            Rectangle rect = new Rectangle(5, 10);
            rect.displayDetails();
            
            rect.setWidth(7);
            rect.setHeight(3);
            rect.displayDetails();

        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}

