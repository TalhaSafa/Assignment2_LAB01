import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
    public static int findMax(int[] array){
        int size = array.length;
        int currentMax = array[0];
        for(int i = 0; i < size -1; i++){
            if(currentMax < array[i+1]){
                currentMax = array[i+1];
            }
        }
        return currentMax;
    }

    //Method to find the min value in the array
    public static int findMin(int[] array){
        int size = array.length;
        int currentMin = array[0];
        for(int i = 0; i < size - 1; i++){
            if(currentMin > array[i+1]){
                currentMin = array[i+1];
            }
        }
        return currentMin;
    }

    public static int sumOfOddNumberIndex(int[] arr){
        int sum = 0;
        for(int i = 1; i < arr.length -1; i = i + 2){
            sum += arr[i];
        }
        return sum;
    }

    // method to find the sum of integers at even indexes
    public static double findEvenIndex(int[] array)
    {
        double sum = 0;

        for(int i = 0; i < array.length-1; i = i + 2)
        {
            sum += array[i];
        }

        return sum;
    }

    // Method to find the differences between the average of the array with every element of the array.
    public static double[] AverageDifference(Double average, int[] array ){
        double[] averageDifference= new double[array.length];
        double diference = 0;
        for ( int i = 0; i < array.length; i++ ){
                diference = array[i] - average; // Casting the integer array to double
                averageDifference[i] =  diference;       
            }
            return averageDifference;
    }    
    

    //Eren's part.

    public static void displayMenu (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Determine size of the Array between 1-100: ");

        int theSize = scan.nextInt();
        while(theSize < 0)
        {
            System.out.print("Enter an integer larger than 0: ");
            theSize = scan.nextInt();
        }
             
        int [] array_1 = createRandomArray(theSize);
        int choice =-1;
        while(choice != 4){
            System.out.println("------------------- MENU -------------------");
            System.out.println("1-Find the minimum and the maximum of the array.");
            System.out.println("2-Find the average of the array. Display how each element of the array differs from the average.");
            System.out.println("3-Find the sum of elements with odd- and even-numbered indexes.");
            System.out.println("4-Type 4 to Exit.");

            choice = scan.nextInt();
            if(choice == 1){
                System.out.println("The minimum value of the Array: " + findMin(array_1));
                System.out.println("The maximum value of the Array: "+ findMax(array_1) );
            }
            if(choice == 2){
               System.out.println("The avarage of the array: " + findAverage(array_1));
               System.out.println("Array elements differ from the avarage: " );
               double[] avarageDiffs = AverageDifference(findAverage(array_1), array_1);
               for(int i = 0 ; i < avarageDiffs.length ; i++)
               {
                    if(i == avarageDiffs.length -1)
                    {
                        System.out.printf("%.2f", avarageDiffs[i]);
                    }
                    else
                    {
                        System.out.printf("%.2f , ", avarageDiffs[i]);
                    }

               }
               System.out.println();
            }
            if(choice == 3){
                System.out.println("The sum of elements with odd numbered indexes:  " + sumOfOddNumberIndex(array_1)); 
                System.out.println("The sum of elements with even numbered indexes:  " + findEvenIndex(array_1));
            }
            if(choice == 4){
                System.out.println("Exiting the simulator.");
                break;
            }

            System.out.println();
        }
    }

    public static void main(String args[])
    {
        displayMenu();
    }
}
