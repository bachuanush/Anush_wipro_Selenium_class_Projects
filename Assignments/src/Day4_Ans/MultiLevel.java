package Day4_Ans;

class Vehicle {
    void type() {
        System.out.println("Four_Wheeler");
    }
}

class Four_wheeler extends Vehicle {
    void type1() {
        System.out.println("Petrol_Four_Wheeler");
    }
}

class Petrol_Four_Wheeler extends Four_wheeler {
    void type2() {
        System.out.println("This Petrol_Four_Wheeler is a Five-Seater");
    }
}

class FiveSeater_Petrol_Four_Wheeler extends Petrol_Four_Wheeler {
    void type3() {
        System.out.println("This Five-Seater Petrol Four Wheeler is a Baleno");
    }
}

class Baleno_FiveSeater_Petrol_Four_Wheeler extends FiveSeater_Petrol_Four_Wheeler {
    void type4() {
        System.out.println("Baleno is manufactured by Maruti Suzuki");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        Baleno_FiveSeater_Petrol_Four_Wheeler obj = new Baleno_FiveSeater_Petrol_Four_Wheeler();

        obj.type();   
        obj.type1();  
        obj.type2();  
        obj.type3();  
        obj.type4();  
    }
}
