package Day6_Ans;

enum Shape {
    CIRCLE {
        @Override
        double area(double... params) {
            double radius = params[0];
            return Math.PI * radius * radius;
        }
    },
    SQUARE {
        @Override
        double area(double... params) {
            double side = params[0];
            return side * side;
        }
    },
    RECTANGLE {
        @Override
        double area(double... params) {
            double length = params[0];
            double width = params[1];
            return length * width;
        }
    },
    TRIANGLE {
        @Override
        double area(double... params) {
            double base = params[0];
            double height = params[1];
            return 0.5 * base * height;
        }
    };

    abstract double area(double... params);
}

public class AreaCal {
    public static void main(String[] args) {
        double[][] sampleParams = {
            {5},     
            {4},   
            {6, 3},    
            {8, 5}     
        };

        Shape[] shapes = Shape.values();

        for (int i = 0; i < shapes.length; i++) {
            double area = shapes[i].area(sampleParams[i]);
            System.out.printf("%s area = %.2f%n", shapes[i], area);
        }
    }
}

