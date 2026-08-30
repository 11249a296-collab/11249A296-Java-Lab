public class TrainCodes {
    public static void main(String[] args) {

        int trainCodes[] = {101,102,103,104};

        try
        {
            System.out.println(trainCodes[6]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception Caught: "+e);
        }

        System.out.println("Program Continues...");
    }
}