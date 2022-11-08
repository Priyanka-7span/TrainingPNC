package except;

public class PrintStackTrace {
    public static void main(String[] args) {
        try{
            int[] myNumbers ={1,2,3,4,5};
            System.out.println(myNumbers[5]);
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

