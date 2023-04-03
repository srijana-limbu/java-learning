import java.util.Scanner;

public class CurrencyConverter {
    //2.Make the Currency converter program where Nepali rupees are converted to the USD. Take the currency difference
    // as 1 USD = 135.03 for conversation. [5 marks]
    //take input
    // 1/135.03= 0.00740576168


    public static void main(String[] args)
    {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the rupees to convert into USD: ");
        double r = obj.nextInt();
        double d = (float) r/135.03;
        System.out.println(r +" " +"Rupees"+ " "+ d +" " +"Dollar");
    }
}
