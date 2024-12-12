//Create a program to search an element in a 2-D array

import java.util.Scanner;

public class c48 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[][] myarr2 = ArrayUtility.input2Darray();
    System.out.print("Enter the number to search : ");
    int num = input.nextInt();

    if(search2Darr(myarr2, num)){
      System.out.println("The "+num+" exist in given 2-D array");
    }else{
      System.out.println(num+" does not exist in given 2-D array");
    }
  
    
  }
  public static boolean search2Darr(int[][] arr, int num){

int r = 0; 
    while(r < arr.length){
      int c = 0;

      while(c < arr[r].length){
        if(arr[r][c] == num)
        return true;
        c++;
      }
      r++;
    }

    return false;
  }
  
}
