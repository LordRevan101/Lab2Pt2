
/**
 * This program will ask for the users first, middle, and last time, and will
 * print out the full name along with the initials.
 * @Alan Dougman
 * @v1.0
 * @since 2/11/25
 */
import java.util.Scanner;
public class Challenege2 {
    public static void main (String[] args){
        String firstName, middleName, lastName;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your first name? ");
        firstName = input.nextLine();
        
        System.out.print("What is your middle name? ");
        middleName = input.nextLine();
        
        System.out.print("What is your last name? ");
        lastName = input.nextLine();
        
        char firstIni = firstName.charAt(0);
        char secondIni = middleName.charAt(0);
        char thirdIni = lastName.charAt(0);
        
        System.out.println("\nYour name is: " + firstName + " " + middleName + " " + lastName);
        System.out.print("Your initials are: " + firstIni + secondIni + thirdIni);
    }
    
}
