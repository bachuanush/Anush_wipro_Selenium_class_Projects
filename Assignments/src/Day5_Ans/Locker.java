package Day5_Ans;

public class Locker {
    private String lockerId;
    private boolean isLocked;
    private String passcode;
    private SecurityManager securityManager;

    private class SecurityManager {
        private boolean verifyPasscode(String code) {
            return passcode.equals(code);
        }
    }

    public Locker(String lockerId, String passcode) {
        this.lockerId = lockerId;
        this.passcode = passcode;
        this.isLocked = true;
        this.securityManager = new SecurityManager();
    }

    public void lock() {
        isLocked = true;
        System.out.println("Locker " + lockerId + " is now locked.");
    }

    public boolean unlock(String code) {
        if (securityManager.verifyPasscode(code)) {
            isLocked = false;
            System.out.println("Locker " + lockerId + " unlocked successfull.");
            return true;
        } else {
            System.out.println("incorrect passcode. not unlocked.");
            return false;
        }
    }

    public boolean isLocked() {
        return isLocked;
    }

    public static void main(String[] args) {
        Locker myLocker = new Locker("L001", "secret123");

        System.out.println("initially locked? " + myLocker.isLocked());

        boolean success = myLocker.unlock("wrongpass");
        System.out.println("unlock attempt with wrong code: " + success);
        System.out.println("is locked? " + myLocker.isLocked());

        success = myLocker.unlock("secret123");
        System.out.println("unlock attempt with correct code: " + success);
        System.out.println("is locked? " + myLocker.isLocked());

        myLocker.lock();
        System.out.println("is locked? " + myLocker.isLocked());
    }
}
