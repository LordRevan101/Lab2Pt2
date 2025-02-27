import java.util.Scanner;
/**
 * This program will ask for the users first, middle, and last time, and will
 * print out the full name along with the initials.
 * @author Alan Dougman
 * @version v1.1
 * @since 2/11/25
 */
public class Challenege2 {
    public static void main (String[] args){
        String firstName, middleName, lastName;
        char firstInit;
        char secondInit;
        char thirdInit;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your first name? ");
        firstName = input.nextLine();
        
        System.out.print("What is your middle name? ");
        middleName = input.nextLine();
        
        System.out.print("What is your last name? ");
        lastName = input.nextLine();
        
        firstInit = firstName.charAt(0);
        secondInit = middleName.charAt(0);
        thirdInit = lastName.charAt(0);
        
        System.out.println("\nYour name is: " + firstName + " " + middleName + " " + lastName);
        System.out.print("Your initials are: " + firstInit + secondInit + thirdInit);
    }
    
}
