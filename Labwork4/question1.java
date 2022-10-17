
package javaapplication22;
import java.util.Scanner;
public class JavaApplication22 {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        
        int number=5;
        boolean booleanVar = number>0;
        
        
        System.out.println(booleanVar);
        System.out.println("Enter a boolean value:");
        


          booleanVar = keyboard.nextBoolean();
          System.out.println("You entered " + booleanVar);
        
       
    }
    
}
