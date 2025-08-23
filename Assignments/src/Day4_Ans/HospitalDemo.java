package Day4_Ans;


class Hospital {
 String hospitalName = "abc hospital";
 String location = "Hyd";
 void hospitalDetails() {
     System.out.println("hospital name: " + hospitalName);
     System.out.println("locatin: " + location);
 }
}

class Patient extends Hospital {
 String patientName;
 int patientId;

 Patient(String name, int id) {
     this.patientName = name;
     this.patientId = id;
 }

 void patientDetails() {
     System.out.println("patient :" + patientName);
     System.out.println("Patient id:" + patientId);

     System.out.println("dmitted : " + hospitalName);
     System.out.println("hospital lcation: " + location);
     super.hospitalDetails();
 }
}

public class HospitalDemo {
 public static void main(String[] args) {
     Patient p1 = new Patient("anush", 101);
     p1.patientDetails();
 }
}

