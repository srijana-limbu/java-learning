public class Main {
    public static void main(String[] args)
    {
        String isloading = "True";
        try{
            int divider = 0;
            int value = 100;

            int result = value/divider;
            System.out.println("Result is"+result);


        }catch (Exception error){
            System.out.println("Error"+error);

        }finally {
            isloading = "False";
            System.out.println("This is finally block");
        }

//        if(divider == 0){
//            throw new Exception();
        }

    }
    static  void  anotherWork(){
        System.out.println("another Work");
        anotherWork();
    }
}