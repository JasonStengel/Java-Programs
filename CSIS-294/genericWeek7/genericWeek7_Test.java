/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericWeek7;
import java.util.ArrayList;
import java.security.SecureRandom;
/**
 *
 * @author jason.stengel
 */
public class genericWeek7_Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        
//        String[] alphabet = new String[]{"a","b","c","d","e","f","g","h","i","j",
//            "k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
//        int y = 1;
//
//        
//        
//     ArrayList<String> lstTest = new ArrayList<>();
//     SecureRandom oRand = new SecureRandom();
//     
////     lstTest.add("Hello");
////     lstTest.add("hi"); 
//     
////     System.out.println("Index 1: " + lstTest.get(1));
//               
//        StringBuilder oSB = new StringBuilder();
//        
//        
//        
//        long lBegin = System.nanoTime();
//        //builds random words with traditional strin concatination
//         for(int x = 0;x < 10; x++){        
//             oSB = new StringBuilder();
//            oSB.append(alphabet[oRand.nextInt(alphabet.length)]);
//            oSB.append(alphabet[oRand.nextInt(alphabet.length)]);
//            oSB.append(alphabet[oRand.nextInt(alphabet.length)]);
//            lstTest.add(oSB.toString());
//        }
//           long lsbElapsed = System.nanoTime() - lBegin;
//        
//        
//            lBegin = System.nanoTime();
//        //build random words with stringBuilder
//        for(int x = 0;x < 10; x++){            
//            String oRandomWord = alphabet[oRand.nextInt(alphabet.length)];
//            oRandomWord += alphabet[oRand.nextInt(alphabet.length)];
//            oRandomWord += alphabet[oRand.nextInt(alphabet.length)];
//           lstTest.add(oRandomWord);
//        }
//           long lTraditionalElapsed = System.nanoTime() - lBegin;
//
//        
//       //printing out arraylist 
//        for(String sItem: lstTest){
//            
//            System.out.printf("\nIndex %d is:%s", y , sItem);
//            
//            y++;
//            
//        }
//        System.out.println("\nStringBuild Time" + lsbElapsed);
//        System.out.println("Traditional Time" + lTraditionalElapsed);

        
        ArrayList<Android> lstAndroids = new ArrayList<>();
        
        Android oAndroid1 = new Android();
        oAndroid1.name = "Chappie";
        oAndroid1.storylines = new ArrayList<>();
        
        Android oAndroid2 = new Android();
        oAndroid2.name = "Wall-e";
        oAndroid2.storylines = new ArrayList<>();
        
        
        storyLine oStoryLine1 = new storyLine();
        oStoryLine1.title = "Catch Outlaw";
        storyLine oStoryLine2 = new storyLine();
        oStoryLine2.title = "Bank Robbery";
        
        oAndroid1.storylines.add(oStoryLine1);
        oAndroid2.storylines.add(oStoryLine2);
        
        
        
        lstAndroids.add(oAndroid1);
        lstAndroids.add(oAndroid2);
       
        for(Android oAndroid: lstAndroids){
            System.out.println("name:" + oAndroid.name);
           for(storyLine oStoryLine: oAndroid.storylines){
               System.out.println("story title:" + oStoryLine.title);
           }    
       }       
     }     
}
