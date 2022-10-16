
package question2;
import java.util.Scanner;
public class Question2 {

    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter first integer: ");
        int a = input.nextInt();
        
        System.out.println("Enter second integer");
        int b = input.nextInt();
        
        int dif = a-b;
        
        System.out.println("Difference of the numbers are "+dif);
        
        
        
    }
    
}
