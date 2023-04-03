public class Q4 {
    public  void ans4() {
        int[] numbers = {4,5,9,2,12,24,-1};
        int temp = 0;
        for(int i=0; i<numbers.length;i++)
        {
            for(int j=i+1; j<numbers.length;j++){
                if(numbers[i]>numbers[j]){
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        System.out.println("the smallest value is"+" "+numbers[0]+" the largest value is"+ " "+numbers[numbers.length-1]);
    }
}
