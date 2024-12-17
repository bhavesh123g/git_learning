import java.util.Scanner;

public class occNum {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] arr = arrayutility.inputarray();
    System.out.print("Enter the number to search : ");
    int num = input.nextInt();
    int occ = findOccNum(arr, num);
    System.out.println(occ);

  
  }
  public static int findOccNum(int[] arr , int num){
    int occ = 0;
    int i = 0;
    while (i < arr.length) {
      if(num == arr[i]){
        occ++;
      }
      i++;
    }



    return occ;
  }
}