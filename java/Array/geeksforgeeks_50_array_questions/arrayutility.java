import java.util.Scanner;

public class arrayutility {

  public static int[] inputarray(){
    Scanner input = new Scanner(System.in);  
    System.out.print("\nPlease enter the size of number : ");
    int sizeOfArray = input.nextInt();
    int[] myArry = new int[sizeOfArray];
    int i = 0; 
    while(i < myArry.length){
      System.out.print("Enter the element no "+(i+1)+" : ");
      myArry[i] = input.nextInt();
      i++;
    }
    return myArry;
  }

  public static void displayArr(int[] arr){

    int i = 0; 
    while(i < arr.length){
      System.out.println(arr[i]);
      i++;
    }
    


  }
}