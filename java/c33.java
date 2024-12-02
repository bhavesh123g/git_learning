import java.util.Scanner;

public class c33 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int i = 1;
    while(i == 1){
    greet();
    int num1 = readnum();
    int num2 = readnum();
    System.out.println("The GCD of the "+num1+" and "+num2+" is "+gcd(num1, num2));
    System.out.print("Enter 0 to stop or enter 1 to continue the program : ");
    i = input.nextInt();
    }
    
  }

  public static int gcd(int a , int b ){
    int gcd = 1;
    int i = 2;
    while( i <= leastnum(a, b)){
      if (a%i == 0 && b%i == 0){

        gcd = i;
      }
      i++;
    }


    return gcd;
  }
  public static int leastnum(int a , int b){
    if (a < b){
      return a ; 

    }else{
      return b;
    }
  }


  public static int readnum(){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number : ");
    int firstnum = input.nextInt();
    return firstnum;
  }
  public static void greet(){
    System.out.println("\nwelcome the  calculator\n");
  }
}