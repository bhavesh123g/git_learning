import java.util.Scanner;
public class arreySearching {
  public static void main(String[] args) {
    int[] randomNoarr = {3,6,9,12,15,18,21,24,27,30};
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any number less the 30 : ");
    int inputNum = input.nextInt();


    int index =0; 
    while(index <= randomNoarr.length){
      if(inputNum == randomNoarr[index]){
        System.out.println("Number "+inputNum+" exists in array ");
      }
     
      index++;
    }
  }
}
