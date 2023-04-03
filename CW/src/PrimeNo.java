import java.util.Scanner;

public class PrimeNo {
    public void q1() {
        int count=0;
        Scanner scanner = new Scanner(System.in) ;
        int num = scanner.nextInt();
       for(int i=1; i<=num/2; i++)
       {
           if(num%i== 0)
           {
               count++;


           }

       }
       if(count==1)
       {
           System.out.println("prime number");
       }
       else
       {
           System.out.println("composite number");
       }
       scanner.close();
    }
}
