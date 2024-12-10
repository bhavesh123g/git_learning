// Create a program to find the maximum and minimum element in an array.
public class c42 {
  public static void main(String[] args) {
    ArrayUtility.greet();
    int[] myArry = ArrayUtility.inputarray();
    System.out.println("The maximum number in array is "+maxArrNum(myArry));
    System.out.println("The minimum number in array is "+minArrNum(myArry));
    
  }
  public static int minArrNum(int[] arr){
    int min = arr[0] ;
    int i = 0;
    while(i < arr.length){
      if(min > arr[i]){
        min = arr[i];

      }
      i++;
    }
    return min;
  }
  public static int maxArrNum(int[] arr){
    if (arr.length == 0){
      return 0;
    }

    int max = arr[0];
    int i = 0;
    while(i < arr.length){
      if(max < arr[i]){
        max = arr[i];

      }
      i++;
    }

    return max;
  }
  
}
