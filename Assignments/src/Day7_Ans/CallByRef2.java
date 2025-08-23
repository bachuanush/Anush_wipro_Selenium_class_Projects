package Day7_Ans;


class Box1 {
 int length;

 Box1(int length) {
     this.length = length;
 }
 void display() {
     System.out.println("length: " + length);
 }
}
public class CallByRef2 {
 static void modifyBox(Box1 b) {
     b.length = 100;  
     System.out.println("inside modifyBox method:");
     b.display();
 }

 public static void main(String[] args) {
     Box1 box = new Box1(10);  
     System.out.println("before modifyBox call:");
     box.display();

     modifyBox(box); 

     System.out.println("after modifyBox call:");
     box.display();  
 }
}
