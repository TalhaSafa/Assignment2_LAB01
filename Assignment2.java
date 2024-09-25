import java.util.Random;

public class Assignment2
{
    public static int[] createRandomArray(int size)
    {
        Random ran = new Random(); 
        int[] newArray = new int[size];

        for(int i = 0 ; i < newArray.length ; i++)
        {
            newArray[i] = ran.nextInt(0,101);
        }
        
        return newArray;
    }
}