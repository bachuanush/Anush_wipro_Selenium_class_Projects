package Day4_Ans;


class After_12Th {
 void displayOptions() {
     System.out.println("streams after 12th: Engineering, Medical, Other Courses");
 }
}

class Engineering extends After_12Th {
 void engineeringBranches() {
     System.out.println("engineering branche: IT, Mechanical, CS");
 }
}

class Medical extends After_12Th {
 void medicalBranches() {
     System.out.println("medical branches: MBBS, etc");
 }
}

class Other_courses extends After_12Th {
 void otherCourseOptions() {
     System.out.println("other courses: BBA, BCA");
 }
}

public class HierarchicDemo {
 public static void main(String[] args) {
     Engineering eng = new Engineering();
     eng.displayOptions();
     eng.engineeringBranches();

     System.out.println("*******************************");

     Medical med = new Medical();
     med.displayOptions();
     med.medicalBranches();

     System.out.println("*******************************");

     Other_courses oc = new Other_courses();
     oc.displayOptions();
     oc.otherCourseOptions();
 }
}
