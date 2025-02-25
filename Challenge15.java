import javax.swing.JOptionPane;
/**
 * This program will use the OptionPanel to ask the user for price per share and
 * how much they want to purchase. It will output the results, all in a Panel.
 * @author Alan Doughman
 * @version v1.0
 * @since 2/18/25
 */
public class Challenge15 {
    public static void main (String[] args) {
    final double COMMISSIONRATE = 0.02;
    double dprice;
    int ishares;
    double finshprice;
    double fincommission;
    double finalprice;
    
    String price = JOptionPane.showInputDialog("What is the price per share?");
    String shares = JOptionPane.showInputDialog("How many shares would you like to purchase?");
    
    dprice = Double.parseDouble(price);
    ishares = Integer.parseInt(shares);
    
    finshprice = dprice*ishares;
    fincommission = finshprice*COMMISSIONRATE;
    finalprice = finshprice+fincommission;
    
    JOptionPane.showMessageDialog(null, "Cost of shares: "+ String.format("$%,.2f",finshprice) + "\n" + "Cost of commission: "+ String.format("$%,.2f",fincommission) + "\n" + "Total cost: "+ String.format("$%,.2f",finalprice));
    
    System.exit(0);
    }
}