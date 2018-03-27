//program prints the date to the user in two different formats
package lab2;

public class displayDate {

	public static void main(String[] args) {
		Date current;
		current = new Date(2, 13, 2016);
		
		//prints the month day and the year
		System.out.printf("month: %d, day: %d, year: %d\n",current.getmonth(), current.getday(),current.getyear());

		//prints full Date
		System.out.println ("\n\nCurrent Date: ");
		System.out.printf ("%d/%d/%d \n", current.getmonth(), current.getday(), current.getyear());
	}
}