// Create a program to find the sum and average of all elements in an array.
import java.util.Scanner;
public class c40 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    greet();
    System.out.print("Please enter the size of number : ");
    int sizeOfArray = input.nextInt();
    int[] myArry = new int[sizeOfArray];
    int i = 0; 
    while(i < myArry.length){
      System.out.print("Enter the element no "+(i+1)+" : ");
      myArry[i] = input.nextInt();
      i++;
    }
    System.out.println("The sum of given arrey is "+sumOfArry(myArry));
    System.out.println("The Average of given arrey is "+averageOfArray(myArry));

  }
  public static void greet(){