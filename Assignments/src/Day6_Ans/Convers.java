package Day6_Ans;

public class Convers {
    public static void main(String[] args) {
        int originalInt = 12345;
  
        String strValue = String.valueOf(originalInt);
        System.out.println("string value: " + strValue);
  
        try {
            int parsedInt = Integer.parseInt(strValue);
            System.out.println("parsed int value: " + parsedInt);
        } catch (NumberFormatException e) {
            System.out.println("string is not a valid integer");
            e.printStackTrace();
        }
        
        String invalidStr = "12a34";
        try {
            int invalidParse = Integer.parseInt(invalidStr);
            System.out.println("parsed int value: " + invalidParse);
        } catch (NumberFormatException e) {
            System.out.println("error:" + invalidStr + " is not a valid integer");
        }
    }
}

