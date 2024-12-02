import java.util.Scanner;

public class c15 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter any number(+ve/-ve/0ro) : ");
    int a = input.nextInt(); 

    if(a==0){
      System.out.print("The number is 0ro");
    }else if(a > 0){
      System.out.print("The number is +ve");
    }else {
      System.out.print("The number is -ve");
    }
  }
  
}
