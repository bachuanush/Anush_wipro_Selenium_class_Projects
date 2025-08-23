package Day7_Ans;

class Box {
    int length;

    Box(int length) {
        this.length = length;
    }
}
public class CallByRef {
    static void modifyBoxLength(Box b) {
        b.length = 100;
    }

    public static void main(String[] args) {
        Box myBox = new Box(50);
        System.out.println("before modify: " + myBox.length);

        modifyBoxLength(myBox); 

        System.out.println("after modify: " + myBox.length);
    }
}
