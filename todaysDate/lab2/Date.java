//program prints the date to the user in two different formats
package lab2;

public class Date 
{
	private int month;
	private int day;
	private int year;
	
	public Date (int month, int day, int year) {
			setmonth (month);
			setday (day);
			setyear (year);
	}
		public void setmonth (int month) {
				this.month = month;
		}
		public void setday (int day) {
			    this.day = day;
		}
		public void setyear (int year) {
			    this.year = year;
		}
		public int getmonth() {
			return month;
		}
		public int getday() {
			return day;
		}
		public int getyear() {
			return year;
		}
}
