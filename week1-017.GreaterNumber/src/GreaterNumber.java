import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        
        System.out.println("Enter the second number: ");
        int secondNum = Integer.parseInt(reader.nextLine());
        
        if (firstNum > secondNum){
            System.out.println("Greater number: " + firstNum);
        }        
        else if (secondNum > firstNum){
            System.out.println("Greater number: " + secondNum);
        }
        else {
            System.out.println("The numbers are equal!");
        }
    }
}
