package Lab2;

import java.util.Scanner;

public class VehicleManager{
	
	public Car[] aoCars = new Car[3];
	public Motorcycle[] moto = new Motorcycle[3];
	Scanner input = new Scanner(System.in);
	public int choice = 0;


	void run(){
//Declaring the Objects of the Car and MotorCycle Class 		
	Car Truck = new Car();
		Truck.running = false;
		Truck.Color = "Red";
		Truck.manufacturer = "Ford";
	Car Van = new Car();
		Van.running = false;
		Van.Color = "Blue";
		Van.manufacturer = "Toyota";
	Car SUV = new Car();
		SUV.running = false;
		SUV.Color = "Black";
		SUV.manufacturer = "BMW";
	
	Motorcycle Moto1 = new Motorcycle();
		Moto1.running = false;
		Moto1.Color = "Red";
		Moto1.manufacturer = "Harley";
	Motorcycle Moto2 = new Motorcycle();
		Moto2.running = false;
		Moto2.Color = "Orange";
		Moto2.manufacturer = "BMW";
	Motorcycle Moto3 = new Motorcycle();
		Moto3.running = false;
		Moto3.Color = "Silver";
		Moto3.manufacturer = "Kawasaki";
	
	aoCars[0] = Truck;
	aoCars[1] = Van;
	aoCars[2] = SUV;
	moto[0] = Moto1;
	moto[1] = Moto2;
	moto[2] = Moto3;
	
	
	
	//Asking user which cars to start
	System.out.print("Which Car would you like to start:\n");
	System.out.println("   color Maker running");
	for(int x = 0;x < 3;x++){
	System.out.printf("#%d: %s %s   %s\n",x+1, aoCars[x].Color ,aoCars[x].manufacturer,aoCars[x].running );	
	}
	
	choice = input.nextInt();
	aoCars[choice-1].on();//calling the on method from the car class
	choice--;
	//outputting which vehicle was started	
	System.out.printf("Of the cars available the %s %s is now running:\n\n",aoCars[choice].Color ,aoCars[choice].manufacturer);
	

	
	
	
	
	//Asking user which Motorcycle to start
	System.out.print("Which Motorcycle would you like to start:\n");
	System.out.println("   color Designer running");
	for(int x = 0;x < 3;x++){
		System.out.printf("#%d: %s %s   %s\n",x+1,moto[x].Color ,moto[x].manufacturer,moto[x].running );	
	}
	choice = input.nextInt();
	moto[choice-1].on();//calling the on method motorcycle class
		choice--;
	//outputting the vehicle that was turned on	
	System.out.printf("Of the Motorcycles available the %s %s is now running:\n\n",moto[choice].Color ,moto[choice].manufacturer);
	
	
	
	
	
	
	
	//asking which vehicle the user would like to start
	System.out.print("Which Car would you like to stop:\n");
	System.out.println("   color Maker running");
	for(int x = 0;x < 3;x++){
		System.out.printf("#%d: %s %s   %s\n",x+1, aoCars[x].Color ,aoCars[x].manufacturer,aoCars[x].running );	
	}
	choice = input.nextInt();
	aoCars[choice-1].off();//calling the off method from the car class
	choice--;
	//outputting the vehicle that was turned on	
	System.out.printf("Of the Cars available the %s %s has now stopped runnig:\n\n",aoCars[choice].Color ,aoCars[choice].manufacturer);
	
	
	
	
	
	//asking the user which motorcycle they would like to stop
	System.out.print("Which Motorcycle would you like to stop:\n");
	System.out.println("   color Maker running");
	for(int x = 0;x < 3;x++){
		System.out.printf("#%d: %s %s   %s\n",x+1, moto[x].Color ,moto[x].manufacturer,moto[x].running );	
		}
		choice = input.nextInt();
		moto[choice-1].off();//calling the off method from the motorcycle class
			choice--;	
		//outputting the vehicle that was turned on	
	System.out.printf("Of the Motorcycles available the %s %s has now stopped runnig:\n\n",moto[choice].Color ,moto[choice].manufacturer);
	
	
		
		
		
		
		//Outputting the list of the vehicles started or stopped to the user 
	System.out.println("Here is list of stopped/started vehichles");		
	System.out.println("  C color Designer running");
	//loop to print all the cars 
	for(int x = 0;x < 3;x++){
		System.out.printf("#%d: %s %s   %s\n",x+1, aoCars[x].Color ,aoCars[x].manufacturer,aoCars[x].running );
		}
	System.out.println(" M color Designer running");
	//loop to print all the motorcycles	
	for(int x = 0;x < 3;x++){System.out.printf("#%d: %s %s   %s\n",x+1, moto[x].Color ,moto[x].manufacturer,moto[x].running );
	


		}
	}
}

