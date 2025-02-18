/**
 * This program will use the OptionPanel to ask the user for price per share and
 * how much they want to purchase. It will output the results, all in a Panel.
 * @author: Alan Doughman
 * @version: v1.0
 * @since: 2/18/25
 */
import javax.swing.JOptionPane;
public class Challenge15 {
    public static void main (String[] args) {
    // comission is 2% of price of shares purchased!!
    // Ask for share price, and how much they will buy. Multiply those
    // Find comission, 2% of that total.
    // Add comission to total for total total
    final double COMMISSIONRATE = 0.02;
    
    String price = JOptionPane.showInputDialog("What is the price per share?");
    String shares = JOptionPane.showInputDialog("How many shares would you like to purchase?");
    
    double dprice = Double.parseDouble(price);
    int ishares = Integer.parseInt(shares);
    
    double finshprice = dprice*ishares;
    double fincommission = finshprice*COMMISSIONRATE;
    double finalprice = finshprice+fincommission;
    
    JOptionPane.showMessageDialog(null, "Cost of shares: "+ String.format("$%,.2f",finshprice) + "\n" + "Cost of commission: "+ String.format("$%,.2f",fincommission) + "\n" + "Total cost: "+ String.format("$%,.2f",finalprice));
    
    System.exit(0);
    }
}