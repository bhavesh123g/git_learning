import java.util.Scanner;

public class c30 {
  public static void main(String[] args) {
    greet();
    int a = readnum();
    long fact = factorialvalue(a);
    System.out.println("\nThe factorial of "+a+" is "+fact);
  }
  

  public static long factorialvalue(int a){
    int i = 1;
    int factsum = 1;
    while(i<=a){
      factsum=factsum*i;

      i++;
    }


  return factsum;
  }
  public static int readnum(){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number : ");
    int firstnum = input.nextInt();
    return firstnum;
  }
  public static void greet(){
    System.out.println("\nwelcome the factorial calculator\n");
  }
}
