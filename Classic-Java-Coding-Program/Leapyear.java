import java.util.Scanner;

public class Leapyear {
    static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;

    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.print("Enter year: ");
            input = in.next();
            if (input.equalsIgnoreCase("Quit")||input.equalsIgnoreCase("Exit")) {
                System.out.println("Exiting the system....");
                break;
            } else {
                try {
                    if (isLeapYear(Integer.parseInt(input))) {
                        System.out.println("Year: " + input + " is a leap year");
                    } else {
                        System.out.println("Year: " + input + " is not a leap year");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Enter a valid number");
                }
            }
        }
    }
}