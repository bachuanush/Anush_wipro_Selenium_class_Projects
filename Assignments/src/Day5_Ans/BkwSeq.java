package Day5_Ans;


public class BkwSeq implements CharSequence {
    private final String reversed;
    
    public BkwSeq(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be empty");
        }
        this.reversed = new StringBuilder(input).reverse().toString();
    }

    @Override
    public int length() {
        return reversed.length();
    }

    @Override
    public char charAt(int index) {
        if (index < 0 || index >= length()) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return reversed.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0 || end > length() || start > end) {
            throw new IndexOutOfBoundsException("Invalid subseq");
        }
        return reversed.substring(start, end);
    }

    @Override
    public String toString() {
        return reversed;
    }

    public static void main(String[] args) {
    	BkwSeq seq = new BkwSeq("hello");

        System.out.println("string: " + seq.toString()); 
        System.out.println("len: " + seq.length()); 
        System.out.println("charAt(1): " + seq.charAt(1)); 
        System.out.println("subSeq: " + seq.subSequence(1, 4));
    }
}
