import java.util.Scanner;

public class functionreturn {
  public static void main(String[] args) {
    

    greet();
    int first = readnumber();
    int second = readnumber();
    
   
   int sum = sum2num(first, second);   //argiments
    System.out.print(  "The sum of 2  number is : "+sum);
  }
  public static int sum2num(int first , int second ){     //parameter
    int sum = first +second;

    return sum;
  }
  public static int readnumber(){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number : ");
    int firstnum = input.nextInt();
    return firstnum;


  }
  public static void greet(){
    System.out.println("\nwelcome the calculator\n");
  }



  }
  

