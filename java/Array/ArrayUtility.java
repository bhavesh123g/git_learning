import java.util.Scanner;

public class ArrayUtility {


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
      
    
  }


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
  
  public static void greet(){
    System.out.println("\nWellcome to calculator\n");
  }

  public static void displayArr(int[] arr){
    int i = 0;
    while(i < arr.length){
      System.out.println(arr[i]);
      i++;
    }
  }


  public static int[] revArr(int[] arr){
    
    int i = 0;
    float halfvalue = arr.length;
    halfvalue = (halfvalue/2)-1;
    //System.out.println(halfvalue);

    while(i <= halfvalue){

      //System.out.println(i);
      int swap = 0;
      swap = arr[i];
      arr[i] =arr[arr.length-1-i];
      arr[arr.length-1-i]= swap;

      i++;
    }

    return arr;
  }  
}
