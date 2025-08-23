package Day4_Ans;



class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println("Sum of 5 and 10: " + obj.add(5, 10));
        System.out.println("Sum of 1, 2 and 3: " + obj.add(1, 2, 3));
        System.out.println("Sum of 4.5 and 3.7: " + obj.add(4.5, 3.7));
    }
}
