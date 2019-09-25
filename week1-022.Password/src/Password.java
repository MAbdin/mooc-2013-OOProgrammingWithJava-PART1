
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        //ask user to enter the password
        System.out.println("Type the password: ");
        String pass = reader.nextLine();
        
        //run while loop until the two passwords match
        while(!pass.equals(password)){
            
            System.out.println("Wrong!");
            
            System.out.println("Type the password: ");
            pass = reader.nextLine();
            
        }
            System.out.println("Right!");
            System.out.println("The secret is: Yeet.");
        
    }
}
    
