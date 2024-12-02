import java.util.Scanner;

public class sum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num1;
    System.out.print("Enter first number : ");
    num1 = input.nextInt();
    System.out.print("Enter second number : ");
    int num2 = input.nextInt();
    int sum; 
    sum = num1+num2;
    System.out.print("The sum of two number is "+sum);




  }
}
