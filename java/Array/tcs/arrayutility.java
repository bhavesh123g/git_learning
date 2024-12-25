import java.util.Scanner;

public class arrayutility {


  // A utility method to swap two numbers.
  public static void swap(int arr[], int a, int b)
  {
      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
  }

  public static int[][] input2Darray(){
    Scanner input = new Scanner(System.in);  
    System.out.print("Enter the number of rows : ");
    int rows = input.nextInt();
    System.out.print("Enter the number of columns : ");
    int columns = input.nextInt();


    int[][] myArry = new int[rows][columns];



    int r = 0; 
    while(r < rows){
      int c = 0;

      while(c < columns){
        System.out.print("Enter the element no  "+(r+1)+" "+(c+1)+"  : ");
        myArry[r][c]= input.nextInt();
        c++;
      }
      r++;
    }
    return myArry;
  }

  public static void display2Drr(int[][] arr){
    int r = 0; 
    while(r < arr.length){
      int c = 0;

      while(c < arr[r].length){
        System.out.println(arr[r][c]);
        c++;
      }
      r++;
    }
      
    
  } public static int[] inputarray(){
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