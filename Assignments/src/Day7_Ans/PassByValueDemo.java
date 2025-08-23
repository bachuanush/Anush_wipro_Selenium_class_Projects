package Day7_Ans;

public class PassByValueDemo {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("before method call, num = " + num);

        changeValue(num);

        System.out.println("after method call, num = " + num);
    }
    public static void changeValue(int n) {
        n = 50;  
        System.out.println("inside method, n = " + n);
    }
}
