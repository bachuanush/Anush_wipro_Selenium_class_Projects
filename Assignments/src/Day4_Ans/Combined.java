package Day4_Ans;


abstract class SmartDevice {
 abstract void turnOn();
 abstract void turnOff();
 abstract void performFunction();
}

class SmartPhone extends SmartDevice {
 @Override
 void turnOn() {
     System.out.println("smartphone turn on");
 }

 @Override
 void turnOff() {
     System.out.println("smartphone turn off");
 }

 @Override
 void performFunction() {
     System.out.println("smartphone: calling and browsing");
 }
}

class SmartWatch extends SmartDevice {
 @Override
 void turnOn() {
     System.out.println("smartwatch turn on");
 }

 @Override
 void turnOff() {
     System.out.println("smartwatch turn off");
 }

 @Override
 void performFunction() {
     System.out.println("smartwatch: track fitness and time.");
 }
}

class SmartSpeaker extends SmartDevice {
 @Override
 void turnOn() {
     System.out.println("smartspeaker turn on");
 }

 @Override
 void turnOff() {
     System.out.println("smartspeaker turn off");
 }

 @Override
 void performFunction() {
     System.out.println("smartspeaker: plays music and respond to voice commands.");
 }
}

public class Combined {
 public static void main(String[] args) {
     SmartDevice[] devices = {
         new SmartPhone(),
         new SmartWatch(),
         new SmartSpeaker()
     };

     for (SmartDevice device : devices) {
         device.turnOn();
         device.performFunction();
         device.turnOff();
         System.out.println("**********************");
     }
 }
}
