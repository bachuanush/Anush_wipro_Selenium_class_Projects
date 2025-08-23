package Day6_Ans;

import java.util.Scanner;

enum DaysOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter day of week: ");
        String input = scanner.nextLine().trim().toUpperCase();

        try {
            DaysOfWeek day = DaysOfWeek.valueOf(input);

            System.out.println("position of " + day + " is: " + day.ordinal());

            switch(day) {
                case SATURDAY:
                case SUNDAY:
                    System.out.println(day + " is a weekend day.");
                    break;
                default:
                    System.out.println(day + " is a weekday.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("invalid day entered");
        }

    }
}

