import java.util.Scanner;

public class SwitchStuff {
	public static void main(String[] args){
		int days;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of days: ");
		days = scan.nextInt();

        //This program will print 'May' when you run it.
        switch (days) {
            case 30: System.out.println("April, June, September, November");
                     break;
            case 31: System.out.println("January, March, May, July, August, October, December");
                     break;
            case 28: 
            case 29: System.out.println("February");
                     break;
            default: System.out.print("No months have " + days + " days!");
            		 break;
        }
	}
}
