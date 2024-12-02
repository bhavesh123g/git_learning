import java.util.Scanner;

public class c28 {
  public static void main(String[] args) {
    greet();
    int num = readnum();
    printmultiplicationtable(num);

    
 

  }
  public static void printmultiplicationtable(int num){
    int i=1; 
    while(i <= 10){

      System.out.println(num +" X "+i +" = "+i*num);
      i++;
    }


  }
  public static int readnum(){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number : ");
    int firstnum = input.nextInt();
    return firstnum;
  }
  public static void greet(){
    System.out.println("\nwelcome the multiplication table calculator\n");
  }
  
    


 
}
