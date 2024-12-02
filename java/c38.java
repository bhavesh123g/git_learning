import java.util.Scanner;

public class c38 {
  public static void main(String[] args) {
    greet();
    int a = readnum();
    int reverse = reverse(a);
    if(a == reverse){
      System.out.println("The number is palindrome ");

    }else{
      System.out.println("The number not is palindrome ");

    }
    
    
  }
  public static int reverse(int a){
  
    int sum=0;
    while(a > 0 ){
      int digit = a%10;
      sum = sum*10+digit;
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
    System.out.println("\nwelcome to the palindrome calculator\n");
  }
  
}
