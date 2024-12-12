//Create a program to return a new array deleting a specific element.

import java.util.Scanner;

public class c44 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayUtility.greet();
    int[] myArry = ArrayUtility.inputarray();
    System.out.print("Now, enter a number you want to delete : ");
    int noToDelete = input.nextInt();
    int[] newarr = deleteNo(myArry, noToDelete);
    ArrayUtility.displayArr(newarr);
  }

  public static int[] deleteNo(int[] arr, int numToDelete){
    int occ = ArrayUtility.occNum(arr, numToDelete);
    if (occ == 0){
      return arr;
    }
    int[] newArr = new int[arr.length-occ];

    int i = 0; 
    int j = 0;
    while(i < arr.length){
      if(arr[i] != numToDelete){
        newArr[j]=arr[i];
        j++;

      }


      
      i++;
    }
    return newArr;
  }
}
