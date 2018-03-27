package Week7;
import java.security.SecureRandom;
import java.util.ArrayList;


public class week7_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom oRand = new SecureRandom();
		
		
//********************************************************************					
		phone oPhone1 = new phone();
			oPhone1.phoneNumber = ((1000000)+oRand.nextInt(9000000));
		
		phone oPhone2 = new phone();
			oPhone2.phoneNumber = ((1000000)+oRand.nextInt(9000000));
		
		customer oCustomer1 = new customer();
			oCustomer1.firstName = "John";
			oCustomer1.lastName = "Smitt";
			
		customer oCustomer2 = new customer();
			oCustomer2.firstName = "George";
			oCustomer2.lastName = "Johnson";
			
			
		clubMembers oMembers1 = new clubMembers();
			oMembers1.State = "California";
			oMembers1.Customer = new ArrayList<>();
			oMembers1.number = new ArrayList<>();
			
			oMembers1.Customer.add(oCustomer1);
			oMembers1.Customer.add(oCustomer2);
			oMembers1.number.add(oPhone1);
			oMembers1.number.add(oPhone2);	
//********************************************************************					
		phone oPhone3 = new phone();
			oPhone3.phoneNumber = ((1000000)+oRand.nextInt(9000000));
			
		phone oPhone4 = new phone();
			oPhone4.phoneNumber = ((1000000)+oRand.nextInt(9000000));
			
		customer oCustomer3 = new customer();
			oCustomer3.firstName = "Sam";
			oCustomer3.lastName = "Ortega";
		customer oCustomer4 = new customer();
			oCustomer4.firstName = "Ted";
			oCustomer4.lastName = "Marlin";
				
		clubMembers oMembers2 = new clubMembers();
			oMembers2.State = "Washington";
			oMembers2.Customer = new ArrayList<>();
			oMembers2.number = new ArrayList<>();
				
			oMembers2.Customer.add(oCustomer3);
			oMembers2.Customer.add(oCustomer4);
			oMembers2.number.add(oPhone3);
			oMembers2.number.add(oPhone4);
//********************************************************************						
		phone oPhone5 = new phone();
			oPhone5.phoneNumber = ((1000000)+oRand.nextInt(9000000));
		phone oPhone6 = new phone();
			oPhone6.phoneNumber = ((1000000)+oRand.nextInt(9000000));
				
		customer oCustomer5 = new customer();
			oCustomer5.firstName = "Dean";
			oCustomer5.lastName = "Mathews";
		customer oCustomer6 = new customer();
			oCustomer6.firstName = "Victor";
			oCustomer6.lastName = "Serano";
					
		clubMembers oMembers3 = new clubMembers();
			oMembers3.State = "Texas";
			oMembers3.Customer = new ArrayList<>();
			oMembers3.number = new ArrayList<>();
					
			oMembers3.Customer.add(oCustomer5);
			oMembers3.Customer.add(oCustomer6);
			oMembers3.number.add(oPhone5);
			oMembers3.number.add(oPhone6);		
//********************************************************************								
	ArrayList<clubMembers> alClubMembers = new ArrayList<>();
		alClubMembers.add(oMembers1);
		alClubMembers.add(oMembers2);
		alClubMembers.add(oMembers3);

            for(clubMembers oMembers: alClubMembers){     
            	System.out.println("\nState: " + oMembers.State);            	
              for(customer oCustomer: oMembers.Customer ){     	   
            	  System.out.println("Club Members Name: " + oCustomer.firstName +" "+ oCustomer.lastName); 
                for(phone oPhone: oMembers.number){
                    System.out.println("Can Reach at:" + oPhone.phoneNumber);
                	 
                }	
              }                 	
	        }    
      }
	}	



