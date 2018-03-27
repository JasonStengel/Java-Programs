package lab1;
import java.util.Scanner;
//adds two numbers
public class Addition 
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System. in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.print ("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print ("Enter Second integer: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		
		System.out.printf("The sum is %d\n", sum);
		
		input.close();
	}
	
} 
