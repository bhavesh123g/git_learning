import java.util.Scanner;

public class c32 {
  public static void main(String[] args) {
    greet();
    int numOne = readnum();
    int numTwo = readnum();
    int result = LCM(numOne,numTwo);
    System.out.print(result);
   
  }
  public static int LCM(int numOne, int numTwo){
    int i=1; 
    while(true){
      if(i*numOne%numTwo == 0){
        
        return i*numOne;
      }
     
      i++;
    }
  }
  // public static void LCM(int numOne, int numTwo){
  //   int i=1; 
  //   while(i <= 10){
  //     int resultOne = i*numOne;
  //     System.out.println("The table of "+resultOne);
  //     int j = 1 ;
  //     while(j <=10){
  //       int resultTwo = j*numTwo;
  //       if(resultOne == resultTwo){
  //         System.out.println(resultTwo); 
  //       }
  //       j++;
  //     }
  //     i++;
  //   }
  // }


  public static int readnum(){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number : ");
    int firstnum = input.nextInt();
    return firstnum;
  }
  public static void greet(){
    System.out.println("\nwelcome the LCM calculator\n");
  }
}
