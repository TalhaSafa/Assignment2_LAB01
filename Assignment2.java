public class Assignment2
{
    
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
}