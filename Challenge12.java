/**
 * This program will ask for a city, and then it will return the character
 * amount, the name of the city in caps, and in lowercase. Then it will list the
 * first character.
 * @author: Alan Doughman
 * @version: v1.0
 * @since: 2/13/25
 */
import java.util.Scanner;
public class Challenge12 {
    public static void main (String[] args) {
        String city, upper, lower;
        int length;
        char first;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a city: ");
        city = input.nextLine();
        
        length = city.length();
        upper = city.toUpperCase();
        lower = city.toLowerCase();
        first = city.charAt(0);
        
        System.out.println("This city has: " + length + " characters");
        System.out.println(city + " in uppercase: " + upper);
        System.out.println(city + " in lowercase: " + lower);
        System.out.print(city + "'s first character: " + first);
        
    }
}
