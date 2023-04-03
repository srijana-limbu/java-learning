import java.util.Scanner;

public class CalFibonacci {
    //3. Write the java program to  calculate Fibonacci Series up to n numbers. (Research on your own regarding the
    // Fibonacci Series) [5 marks]

    // 0 1 1 2 3 5 8 13 21........
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("How many terms you want: ");
        int num = obj.nextInt();
        int a = 0;
        int b = 1;

        System.out.print(a+" ");
        System.out.print(b+" ");

        for(int i=3; i<=num; i++)
        {
            int c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }
}