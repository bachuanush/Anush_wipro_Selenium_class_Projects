package Day6_Ans;

enum OperationSwitch {
    PLUS, MINUS, TIMES, DIVIDE;

    public double eval(double a, double b) {
        switch (this) {
            case PLUS:
                return a + b;
            case MINUS:
                return a - b;
            case TIMES:
                return a * b;
            case DIVIDE:
                if (b == 0) throw new ArithmeticException("Division by zero");
                return a / b;
            default:
                throw new AssertionError("Unknown operation " + this);
        }
    }
}

enum OperationOverride {
    PLUS {
        @Override
        public double eval(double a, double b) {
            return a + b;
        }
    },
    MINUS {
        @Override
        public double eval(double a, double b) {
            return a - b;
        }
    },
    TIMES {
        @Override
        public double eval(double a, double b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        public double eval(double a, double b) {
            if (b == 0) throw new ArithmeticException("Division by zero");
            return a / b;
        }
    };

    public abstract double eval(double a, double b);
}

public class CalculatorDemo {
    public static void main(String[] args) {
        double a = 10, b = 5;

        System.out.println("Switch PLUS: " + OperationSwitch.PLUS.eval(a, b));

        System.out.println("Override TIMES: " + OperationOverride.TIMES.eval(a, b));
    }
}

