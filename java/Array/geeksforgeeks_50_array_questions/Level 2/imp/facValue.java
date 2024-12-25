package imp;
import java.util.Scanner;

public class facValue {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    System.out.print("\nEnter the number : ");
    int num = input.nextInt();
    facVal(num);

    
  }
  public static void facVal(int num){
  int[] arr = new int[500];
  
  arr[0] = 1;
  int arrsize = 1;

  int i = 1 ; 
  while(i <= num){
    arrsize = multipl(i , arr, arrsize);


  i++;
  }


  int j = arrsize-1;
  while(j >=0){

    System.out.print(arr[j]);
     j--;  }  
      }

      public static int multipl(int num , int[] arr, int arrsize){

        int carry = 0;
        

        int i = 0;
        while(i < arrsize){
          int prod = arr[i]*num+carry;
          arr[i]= prod%10;
          carry= prod/10;
          i++;
        }

          while (carry != 0) {
            arr[arrsize] = carry % 10;
            carry = carry / 10;
            arrsize++;
        
          i++;
        }
       



        return arrsize;
      }
   
    
}
