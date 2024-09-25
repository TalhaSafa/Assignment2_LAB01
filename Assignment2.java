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

    public static double findAverage(int[] array)
    {
        int sum = 0;
        for(int i = 0; i < array.length ; i++)
        {
            sum += array[i];
        }

        return (double) sum / array.length;
    }

    
    //Method to find the max value in the array
    public int findMax(int[] array){
        int size = array.length;
        int currentMax = array[0];
        for(int i = 0; i-1 < size; i++){
            if(currentMax < array[i+1]){
                currentMax = array[i+1];
            }
        }
        return currentMax;
    }

    //Method to find the min value in the array
    public int findMin(int[] array){
        int size = array.length;
        int currentMin = array[0];
        for(int i = 0; i-1 < size; i++){
            if(currentMin > array[i+1]){
                currentMin = array[i+1];
            }
        }
        return currentMin;
    }
    // Method to find the differences between the average of the array with every element of the array.
    public double[] AverageDifference(Double average, int[] array ){
        double[] averageDifference;
        double diference = 0;
        for ( int i = 0; i < array.length; i++ ){
            diference = array[i] * 1.0 - average; // Casting the integer array to double
            averageDifference[i] =  diference;       
        }
        return averageDifference;

    }

    // method to find the sum of integers at even indexes
    public double findEvenIndex(int[] array)
    {
        double sum = 0;

        for(int i = 0; i < array.length-1; i = i + 2)
        {
            sum += array[i];
        }

        return sum;
    }
}