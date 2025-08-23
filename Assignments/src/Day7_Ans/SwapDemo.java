package Day7_Ans;

public class SwapDemo {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("inside swap method: a = " + a + ", b = " + b);
    }
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println("before swap method call: x = " + x + ", y = " + y);
        swap(x, y);
        System.out.println("after swap method call: x = " + x + ", y = " + y);
    }
}

