//gives the radius circumference and the area based on the radius
package lab1;
import java.util.Scanner;

public class Circle 
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		Scanner again = new Scanner(System.in);
		
		//declaring variables
		boolean answer = true;
		int radius;
		int radiusSquared;
		double pi;
		double diameter;
		double circumference;
		double area;
		
		
		while(answer){ 							 //start of while loop
			System.out.print("Enter radius: "); // prompting a response from user
			radius = input.nextInt();
			
			radiusSquared = radius * radius; 	// is the square of radius
			pi = Math.PI; 						//declaring the value of pi
			diameter = 2 * radius; 				// finding the diameter 
			circumference = (2 * pi) * radius; 	// finding the circumference
			area = pi * radiusSquared; 			//finding the area

			// output values to user found above
			System.out.printf("\nDiameter is %.2f units\n\n", diameter);
			System.out.printf("Circumference is %.2f units\n\n", circumference);
			System.out.printf("Area is %.2f units squared\n\n", area);
			
			//question to restart loop or end program
			answer = false;  
			System.out.print("do you have another radius true or false? ");
			answer = again.nextBoolean();
			

		}
		//close the scanners
		input.close();
		again.close();
	}
}