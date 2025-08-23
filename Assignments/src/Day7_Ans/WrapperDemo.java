package Day7_Ans;

public class WrapperDemo {
    public static void main(String[] args) {
    	//1. Check if character is a digit
        char c = '7';
        System.out.println(c + (Character.isDigit(c) ? " is a digit." : " is NOT a digit."));
        System.out.println("***********************************");    
        // 2. Compare two Strings
        String s1 = "hello";
        String s2 = "world";
        if (s1.equals(s2)) {
            System.out.println("strings are equal.");
        } else {
            System.out.println("strings are NOT equal.");
        }
        System.out.println("***********************************");
        // 3. Convert using valueOf method
        int num = 100;
        Integer intWrapper = Integer.valueOf(num);
        System.out.println("Integer wrapper from int: " + intWrapper);
        
        String str = "123";
        Integer intFromString = Integer.valueOf(str);
        System.out.println("Integer wrapper from String: " + intFromString);
        
        double d = 12.34;
        Double doubleWrapper = Double.valueOf(d);
        System.out.println("Double wrapper from double: " + doubleWrapper);
        System.out.println("***********************************");
        // 4. Create Boolean Wrapper usage
        Boolean bool1 = Boolean.valueOf(true);
        Boolean bool2 = Boolean.valueOf("true");
        Boolean bool3 = Boolean.valueOf("yes");
        System.out.println("Boolean from true: " + bool1);
        System.out.println("Boolean from true: " + bool2);
        System.out.println("Boolean from yes: " + bool3);
        System.out.println("***********************************");
        // 5. Convert null to wrapper classes
        Integer intNull = null;
        Boolean boolNull = null;
        System.out.println("Integer wrapper with null: " + intNull);
        System.out.println("Boolean wrapper with null: " + boolNull);
    }
}

