//Create a program to check is the array is palindrome or not.
public class c46 {
  public static void main(String[] args) {
    ArrayUtility.greet();
    int[] myArry = ArrayUtility.inputarray();
   
    if(ispalindrome(myArry)){
      System.out.println("The array is palindrome");
    }else{
      System.out.println("The array is not palindrome");
    }

    
      
   
  }
  public static boolean ispalindrome(int[] arr){
    int i = 0;
    while(i < arr.length/2){
      if(arr[i] != arr[arr.length-1-i]){
        return false;
      }
      i++;
    }
    return true;
  }
  
}
