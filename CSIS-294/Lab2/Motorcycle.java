package Lab2;


public class Motorcycle extends MotorVehicle implements Engine{
	
	public boolean on(){
		running = true;
		return running;	
	}
	
	public boolean off(){
		running = false;
		return running;	
	}	
}