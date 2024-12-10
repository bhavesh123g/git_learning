import java.util.Scanner;

public class c37 {
  public static void main(String[] args) {
    greet();
    int a = readnum();
     Armstrongnum(a);
    // System.out.println(countnumber(a));
    // int b = readnum();
    // System.out.println(pow(a, b));
    
  }
  public static void Armstrongnum(int a){
 
    int numcopy= a;
    int digits = numberofdigits(a);


  
    int sum=0;
    while(a > 0 ){
      sum = sum + pow(a%10,digits);
      a = a/10;
    }


    if (sum == numcopy){
      System.out.print("The given number is Armstron Number");
    }
    else {
      System.out.print("The given number is not Armstron Number");
    }
  }
  public static int pow(int num1 , int num2){
    int result = num1;

    int i =1 ;
    while (i < num2){
      result *= num1;
      
      i++;
    }
    return result;
  }
  public static int numberofdigits(int num ){
    int count = 0; 
    while(num > 0 ){
      num= num/10;
      count = count +1;
    }
    return count;
  }

  // public static int pow(int a , int pow){
  //   int i = 1 ;
  //   int powsum =1 ;
  //   while (i <= pow){
  //     powsum = a*powsum;
      
  //     i++;
  //   }
  //   return powsum;
  // }
  // public static int numberofdigits(int num ){
  //   int count = 0; 
  //   while(num > 0 ){
  //     num= num/10;
  //     count = count +1;
  //   }
  //   return count;
  // }

// or amother method 

  // public static void Armstrongnum(int a){
  
  //   int sum=0;
  //   while(a > 0 ){
  //     sum = sum+((a%10)*(a%10)*(a%10));
  //     a= a/10;
  //   }
  //   System.out.print(sum); 
  // }

  public static int readnum(){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number : ");
    int firstnum = input.nextInt();
    return firstnum;
  }
  public static void greet(){
    System.out.println("\nwelcome Armstron Number calculator\n");
  }
  
  
}
