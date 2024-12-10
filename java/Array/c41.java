//Create a program to find number of occurrences of an element in an array.

import java.util.Scanner;

public class c41 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayUtility.greet();
    int[] myArry = ArrayUtility.inputarray();
    System.out.print("Enter the occurence number : ");
    int num1 = input.nextInt();

  System.out.println("The number "+num1+" occure in array "+occNum(myArry, num1)+" times");

  }


  public static int occNum(int arr[], int num){


    int index =0; 
    int occ = 0;
    while(index < arr.length){
      if(num == arr[index]){
       occ++;
      }
      index++;
    }
    return occ;

  }
  
}
