import java.util.Scanner;

public class c36 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int i =1;
    while(i == 1){
      greet();
      int a = readnum();


      fibonacciSeries(a);
      System.out.print("Enter 0 to stop or enter 1 to continue the program : ");
      i = input.nextInt();
      }
  }
  public static void fibonacciSeries(int num){
      
    System.out.println("The Fibonacci Series upto "+num+" is : \n0\n1");
    int i = 0, sum = 1;
    
    // while (i+sum < num){
    //   int j = sum;
    //   sum = i +sum; 
    //   i = j;
    //   System.out.println(sum);
     

      // anothe method 
      while(i+sum < num){
        int j = i +sum;
        System.out.print(j+" ");
        i = sum ; 
        sum = j;
      }

    }
    
  
  public static int readnum(){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number : ");
    int firstnum = input.nextInt();
    return firstnum;
  }
  public static void greet(){
    System.out.println("\nwelcome the Fibonacci Series calculator\n");
  }
}
