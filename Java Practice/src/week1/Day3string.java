package week1;


							//String

							//String is stored in String Constant pool and Heap Memory Area.

//public class Day3string{
//public static void main(String[] args) {
//String st = "Hello, How are you?"; //19 bits are allocated in memory
////StringBuffer and StringBuilder
//
//System.out.println(st.charAt(2));
//System.out.println(st.codePointAt(1)); // Return ASCII value
//System.out.println(st.codePointBefore(1));
//System.out.println(st.codePointCount(0, 3));
//
//System.out.println(st.equals("Hello1")); // Checks the equality of 2 Strings
//System.out.println(st.equalsIgnoreCase("hello"));
//System.out.println(st.isBlank()); //checks for only characters
//System.out.println(st.isEmpty()); //Even checks for spaces
//
//System.out.println(st.lastIndexOf("o")); // Last occurence of character. 
//System.out.println(st.contains("o"));
//}
//}



//public class Day3string{
//public static void main(String[] args) {
//String str = "Hello";
//
////Converting String to StringBuffer or String Builder
////Immutable String to Mutable String
//
//StringBuffer sb = new StringBuffer(str);
//sb.append(" Dear");
//System.out.println(sb);
//sb.append(" Students");
//System.out.println(sb);
//
////Converting STringBuffer/StringBuilder to String
////Mutable to Immutable
//
//StringBuffer sbb = new StringBuffer();
//}
//}


			//Methods in StringBuffer/StringBuilder


public class Day3string{
public static void main(String[] args) {
StringBuffer se = new StringBuffer("Welcome");
System.out.println(se.capacity());
System.out.println(se.length());

System.out.println(se.substring(3, 7));
System.out.println(se.deleteCharAt(2));
}
}
