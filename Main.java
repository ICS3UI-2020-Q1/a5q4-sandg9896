import java.util.Scanner;
/**
 * making program to help investors calculate cost
 * @ Gavin 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);
    
    // ask user to enter a starting balance
    System.out.println("Please enter a starting balnce");
    double balance = input.nextDouble();

    System.out.println("Please enter your interest rate in percentage");
    double interest = input.nextDouble();

    System.out.println("Please enter the number of years you will invest for");
    int years = input.nextInt();

    // variable for total
    double total = interest/100.0;

    // for loop
     for(int count = 1; count<=years; count++){
      // print the number we are at
      System.out.println(count);
      // to calculate balance
      interest = balance * total;
      balance = interest + balance;
     }
       System.out.println("Your final balance would be " + balance);



    
  }
}
