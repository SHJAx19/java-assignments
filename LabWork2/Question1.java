
package question1;

import java.util.Scanner;
public class Question1 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        System.out.print("Enter float: ");
        float myFloat = input.nextFloat(); 
        System.out.println("Float entered = " + myFloat);

        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();  
        System.out.println("Double entered = " + myDouble); 
        
        System.out.print("Enter text: ");
        String myString = input.next(); 
        System.out.println("Text entered = " + myString); 
        
        
        System.out.print("Enter integer: ");
        int myInt = input.nextInt(); 
        System.out.println("Integer entered = " + myInt);
        
    }
    
}
