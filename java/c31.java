import java.util.Scanner;

public class c31 {
  public static void main(String[] args) {
    greet();
    int a = readnum();
    System.out.println("\nThe sum of the digits of an integer "+a+" is "+intsum(a));
    
  }
  public static int intsum(int a){
  
    int sum=0;
    while(a > 0 ){
      sum = sum+(a%10);
      a= a/10;
    }
    return sum;
  }

  public static int readnum(){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number : ");
    int firstnum = input.nextInt();
    return firstnum;
  }
  public static void greet(){
    System.out.println("\nwelcome the sum of the digits of an integer calculator\n");
  }
  
}
