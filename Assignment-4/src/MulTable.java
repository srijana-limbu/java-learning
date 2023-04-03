
import java.util.Scanner;
public class MulTable {
    //1.Take a number as input and print the multiplication table for it. The multiplication table should start
    // from 1 to 10. The output should be on format like this
    //Suppose user gave 5 as a input:
    //5 x 1 = 5
    //5 x 2 = 10
    //…. (repeat)
    //5 x 10 = 50 [5 marks]

    //input number 5
    //5*1=5
    //5*2=10
    //5*3=15
    //5*4=24
    //5*5=25
    //5*6=30
    //5*7=35
    //5*8=40
    //5*9=45
    //5*10=50
    public static void main(String[] args) {
        int num;
        System.out.println("Enter any number for multiplication table: ");
        Scanner s1 = new Scanner(System.in);
        num = s1.nextInt();
        for(int i=1; i<=10; i++)
        {
            System.out.println(num + "*" + i + "=" + num*i);
        }


    }

}
