package Week1day6;

//public class Enum2 {
//enum Level{High, Medium, Low}
//public static void main(String[] args) {
//	Level l=Level.Low;
//	switch(l) {
//	case Low:System.out.println("Low Level");
//	break;
//	case Medium:System.out.println("Low Level");
//	break;
//	case High:System.out.println("Low Level");
//	break;
//	}
//}
//}




public class Enum2 {
enum Day{Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}
public static void main(String[] args) {
	Day D=Day.Saturday;
	switch(D) {
	case Monday:System.out.println("Today is Monday");
	break;
	case Tuesday:System.out.println("Today is Tuesday");
	break;
	case Wednesday:System.out.println("Today is Wednesday");
	break;
	case Thursday:System.out.println("Today is Thursday");
	break;
	case Friday:System.out.println("Today is Friday");
	break;
	case Saturday:System.out.println("Today is Saturday(Weekend)");
	break;
	case Sunday:System.out.println("Today is a Sunday (Weekend)");
	break;
	}
}
}