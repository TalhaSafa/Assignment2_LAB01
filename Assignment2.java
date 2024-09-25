import java.util.Scanner;
public class Assignment2
{
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