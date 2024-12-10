import java.util.Scanner;

public class ArrayUtility {
  public static int[] inputarray(){

    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter the size of number : ");
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
  public static void greet(){
    System.out.println("\nWellcome to calculator\n");
  }
}
