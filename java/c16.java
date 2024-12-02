import java.util.Scanner;

public class c16 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter any number : ");
    int a = input.nextInt();
    if(a%2 == 0){
      System.out.print("number is Even");
    }else{

      System.out.print("number is Odd");
    }



  }
  
}
