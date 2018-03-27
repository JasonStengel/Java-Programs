package Week9;
import java.util.HashMap;

public class HashMap_Test {
	
	public static void main(String[] args) {
		
		Person oPerson1 = new Person();
			oPerson1.firstName = "Sparky";
			oPerson1.lastName = "Griswald";
			
		Person oPerson2 = new Person();
			oPerson2.firstName = "Joseph";
			oPerson2.lastName = "Stengel";
			
			HashMap<String,Person> mapPersons = new HashMap<>();
			
				mapPersons.put(oPerson1.lastName, oPerson1);
				mapPersons.put(oPerson2.lastName, oPerson2);
			
			Person oRetrivePerson = mapPersons.get("Griswald");
			
			System.out.println("Last Name1: " + oRetrivePerson.lastName);
			
			Person oRetrivePerson2 = null;
			
			if(mapPersons.containsKey("Stengel")){
				oRetrivePerson2 = mapPersons.get("Stengel");
			}
			
			else{
				System.out.println("That name does noe exist");
			}
			System.out.println("Last Name2: " + oRetrivePerson2.lastName);
		
	}
}
