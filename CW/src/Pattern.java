
//print the pattern
public class Pattern {
    public void Q3() {
        for(int i=0; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");

            }
            for(int k=5; k>=i; k--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
