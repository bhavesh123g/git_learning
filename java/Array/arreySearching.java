import java.util.Scanner;
public class arreySearching {
  public static void main(String[] args) {
    int[] randomNoarr = {3,6,9,12,15,18,21,24,27,30};
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any number less the 30 : ");
    int inputNum = input.nextInt();
    boolean isexists = isexist(randomNoarr, inputNum);

    if(isexists){
    System.out.println("The number "+inputNum+" exists in the string ");
    }else{
    System.out.println("The number "+inputNum+" does not exists in the string ");
    }
  }

  public static boolean isexist(int arr[], int num){


    int index =0; 
    while(index < arr.length){
      if(num == arr[index]){
       return true; 
      }
      index++;
    }
    return false;

  }

  
}
