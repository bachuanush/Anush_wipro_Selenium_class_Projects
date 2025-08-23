package Day8_Ans;

import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueue1 {
public static void main(String[] args) {
PriorityQueue<Patient> emergencyQueue = new PriorityQueue<>(
Comparator.comparingInt(Patient::getSeverity).reversed()
);
emergencyQueue.add(new Patient("Jay", 3));
emergencyQueue.add(new Patient("Sarath", 5));
emergencyQueue.add(new Patient("Mani", 1));
System.out.println("Hospital Queue (Most critical first):");
while (!emergencyQueue.isEmpty()) {
System.out.println("Treating: " + emergencyQueue.poll());
}
PriorityQueue<PrintJob> printQueue = new PriorityQueue<>(
Comparator.comparingInt(PrintJob::getPriority)
);
printQueue.add(new PrintJob("Document", 2));
printQueue.add(new PrintJob("Urgent Report", 1));
printQueue.add(new PrintJob("Presentation", 3));
System.out.println("\nPrint Jobs (Priority order):");
printQueue.forEach(System.out::println);
}
}
class Patient {
String name;
int severity;
public Patient(String name, int severity) {
this.name = name;
this.severity = severity;
}
public int getSeverity() { return severity; }
@Override
public String toString() {
return name + " (Severity: " + severity + ")";
}
}
class PrintJob {
String name;
int priority;
public PrintJob(String name, int priority) {
this.name = name;
this.priority = priority;
}
public int getPriority() { return priority; }
@Override
public String toString() {
return name + " (Priority: " + priority + ")";
}
}
