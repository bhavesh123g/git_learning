import java.util.Scanner;

public class c29 {
  public static void main(String[] args) {
    greet();

    int a = readnum();

    int sum = osum(a);

    System.out.println("\nThe sum of all the odd number between 1 and "+a+" is "+ sum);

  
    
  }
  public static int osum(int a){
    
      int i = 1;
      int sum = 0 ;
      while(i <= a){

        sum = sum+i;
        i = i+2;
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
    System.out.println("\nwelcome the calculator\n");
  }
}
