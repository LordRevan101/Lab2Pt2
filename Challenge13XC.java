/**
 * This program will ask the user for the price, then it will calculate the tax
 * and the tip respectively, then input a total price.
 * @author: Alan Doughman
 * @version: v1.01
 * @since: 2/18/25
 */
import java.util.Scanner;
public class Challenge13XC {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        final double TAX = 0.0725;
        final double TIP = 0.2;
        
        System.out.print("Price for meal: $");
        double price = input.nextDouble();
        
        System.out.println("The tax is: " + String.format("$%,.2f",TAX*price));
        System.out.println("The tip is: " + String.format("$%,.2f",TIP*price));
        System.out.print("The total price is: " + String.format("$%,.2f",(price + TAX*price + TIP*price)));
        
    }
}