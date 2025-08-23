package Day4_Ans;



class Vehicle3 {
    public void start() {
        System.out.println("vehicle starts");
    }
}

class Cars extends Vehicle3 {
    @Override
    public void start() {
        System.out.println("car is starts with key ignition");
    }
}

class Bikes extends Vehicle3 {
    @Override
    public void start() {
        System.out.println("bike is starts with kick");
    }
}
class Trucks extends Vehicle3 {
    @Override
    public void start() {
        System.out.println("truck is starts with engine");
    }
}

public class VehStart {

    public static void testStart(Vehicle3 v) {
        v.start();
    }

    public static void main(String[] args) {
        Vehicle3 car = new Cars();
        Vehicle3 bike = new Bikes();
        Vehicle3 truck = new Trucks();

        testStart(car);    
        testStart(bike);
        testStart(truck); 
    }
}
