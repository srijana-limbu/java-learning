import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args)
    {
        //take user input
        Scanner input = new Scanner(System.in);
        int guess = 0;
        int ans = 5;

        //  compare and guess the answer
        do
        {
            System.out.println("Enter a number between 1 to 10 : ");
            guess = input.nextInt();

            if (guess>ans)
            {
                System.out.println("This number is too high, Please guess the lower number");
            }
            else if (guess<ans)
            {
                System.out.println("This number is too low, Please guess the higher number");

            }
        }while (guess !=ans);
        {
            System.out.println("your guessed is correct.");

        }


    }
}
