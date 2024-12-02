import java.util.Scanner;

public class c17 {
  public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.print("Enter first number ");
     int a = input.nextInt();
     System.out.print("Enter second number ");
     int b = input.nextInt();
     System.out.print("Enter Third number ");
     int c = input.nextInt();

     if( a>=b && a>=c ){
      System.out.print(a+" is the greatest number ");
     }else if( c>=b && c>=a ){
      System.out.print(c+" is the greatest number ");
     }else{
      System.out.print(b+" is the greatest number ");

     }




  }
}
