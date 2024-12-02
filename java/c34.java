import java.util.Scanner;

public class c34 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int i = 1;
    while(i == 1){
    greet();
    int num1 = readnum();
    boolean isprime = prime(num1);
    if (isprime){
      System.out.println("number is prime ");

    }else {
      System.out.println("number is not prime ");
    }
    System.out.print("Enter 0 to stop or enter 1 to continue the program : ");
    i = input.nextInt();
    }
  }
  public static boolean prime(int a){
    if (a == 1 || a == 2){
      return true;
    }
    int i = 2;
    while (i < a){
      if (a%i == 0){
        return false;

      }    
      i++;
    }
return true;
  }
public static int readnum(){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number : ");
    int firstnum = input.nextInt();
    return firstnum;
  }
  public static void greet(){
    System.out.println("\nwelcome the prime number calculator\n");
  }
}
