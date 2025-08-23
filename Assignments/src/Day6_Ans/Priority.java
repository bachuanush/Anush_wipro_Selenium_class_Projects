package Day6_Ans;

public enum Priority {
    LOW(1),
    MEDIUM(2),
    HIGH(3),
    CRITICAL(4);

    private final int severity;
    private static final int URGENCY_THRESHOLD = 3;

    Priority(int severity) {
        this.severity = severity;
    }

    public int getSeverity() {
        return severity;
    }

    public boolean isUrgent() {
        return severity >= URGENCY_THRESHOLD;
    }

    public String getDescription() {
        return String.format("%s (severity: %d) - %s", 
            this.name(), severity, isUrgent() ? "urgent" : "not Urgent");
    }

    public static void main(String[] args) {
        for (Priority level : Priority.values()) {
            System.out.println(level.getDescription());
        }
    }
}
