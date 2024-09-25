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
    public int sumOfOddNumberIndex(int[] arr){
        int sum = 0;
        for(int i = 1; i < arr.length; i = i + 2){
            sum += arr[i];
        }
        return sum;
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
    

    //Eren's part.

    public void displayMenu (  int [] Array ){
        Scanner scan = new Scanner(System.in);
        int choice =-1;
        while(choice != 4){
            

            System.out.println("------------------- MENU -------------------");
            System.out.println("1-Find the minimum and the maximum of the array.");
            System.out.println("2-Find the average of the array.");
            System.out.println("3-Find the sum of elements with odd- and even-numbered indexes.");
            System.out.println("4-Type 4 to Exit.");
            
            choice = scan.nextInt();
            if(choice == 1){
                //caganın method,  Array.method
            }
            if(choice == 2){
                //find the avarage 
            }
            if(choice == 3){
                //find the sum of all
            }
            if(choice == 4){
                System.out.println("Exiting the simulator.");
                break;
            }

        }
    }
}