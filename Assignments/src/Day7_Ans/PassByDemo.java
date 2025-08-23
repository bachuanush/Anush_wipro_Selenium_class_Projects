package Day7_Ans;

public class PassByDemo {
    public static void changeValue(int number) {
        System.out.println("inside method, before change: " + number);
        number = 100;
        System.out.println("inside method, after change: " + number);
    }

    public static void main(String[] args) {
        int originalNumber = 50;
        System.out.println("before method call: " + originalNumber);
        
        changeValue(originalNumber); 
        System.out.println("after method call: " + originalNumber);
    }
}
