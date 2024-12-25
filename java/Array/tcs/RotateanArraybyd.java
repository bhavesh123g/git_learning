import java.util.Scanner;

public class RotateanArraybyd {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    


    int[] arr = arrayutility.inputarray();

    System.out.println("Enter the number : ");
    int r = input.nextInt();

    int i = 1;
    while(i <= r){
      onerot(arr);
      i++;
    }
    arrayutility.displayArr(arr);
  }

  public static int[] onerot(int[] arr){

    int i = 0;
    int temp = arr[0];
    while (i < arr.length-1) {
      arr[i] = arr[i+1];
      i++;
    }
    arr[arr.length -1] = temp;



    return arr;
  }
}