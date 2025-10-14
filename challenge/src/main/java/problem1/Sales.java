package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of sales people : ");
        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        int sum = 0;
        int maxSaleIndex = 0;
        int maximumSale = sales[maxSaleIndex];
        int minSaleIndex = 0;
        int minimumSale = sales[0];
        for (int i=0; i<sales.length; i++)
        {
            // Displaying the information
            System.out.println(" " + (i+1) + " " + sales[i]);
            // Computing the sum of the sales
            sum += sales[i];
            // Computing the maximumSale and its corresponding Person
            if (maximumSale < sales[i]){
                maximumSale =  sales[i];
                maxSaleIndex = i;
            }
            // Same for the minimum sale
            if(minimumSale > sales[i]){
                minimumSale = sales[i];
                minSaleIndex = i;
            }
        }
        System.out.println("\nTotal sales: " + sum);
        // Average sales
        System.out.println("\nAverage sale : " + (double) sum /SALESPEOPLE);
        // Maximum Sale
        System.out.println("Salesperson " +  (maxSaleIndex+1) + " had the highest sale with $ "+maximumSale);
        // Minimum Sale
        System.out.println("Salesperson " +  (minSaleIndex+1) + " had the lowest sale with $ "+minimumSale);

        // Ask the user to enter an amount
        System.out.print("Enter an amount ");
        int amount = scan.nextInt();
        int counter = 0;
        for(int i = 0; i< SALESPEOPLE; i++){
            if (sales[i]>amount){
                System.out.println("Salesperson " + i  +  " exceeds the amount  $" + amount +" with sales $" + sales[i] );
                counter++;
            }
        }
        // Displaying the total number of salepeople exceeeding the amount entered
        System.out.println("Total number of salespeople exceeding $ "+ amount + " : "+counter);

    }
}
