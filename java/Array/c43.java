//Create a program to check if the given array is sorted.
public class c43 {
  public static void main(String[] args) {
    ArrayUtility.greet();
    int[] myArry = ArrayUtility.inputarray();

    
    if(isIncSorted(myArry) || isDecSorted(myArry)){
      System.out.println("\nThe given array is sorted");
    }else{
      System.out.println("\nThe given array is not sorted");
    }



    
  }
  public static boolean isDecSorted(int[] arr){

    int i = 0; 
    int j = 1;
    int sum = 0;

    while(i < arr.length){
     // System.out.println(arr[i]);
      while(j == (i+1) && j <arr.length){
        if(arr[i] > arr[j]){
          sum++;
        }
        j++;
      }
      i++;
    }
    // System.out.print(sum);
    if(sum == (arr.length-1)){
      return true;
    }else{
      return false;
    }
  }

  // faster than above method 
  public static boolean isIncSorted(int[] arr){

    int i = 1; 
    while (i < arr.length){
      if(arr[i] < arr[i-1]){
        return false ;
      }
      i++;
    }
    return true ;
  }
  



}
