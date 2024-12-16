public class min_max {

  public static void main(String[] args) {
    int[] arr = arrayutility.inputarray();
    int min = min(arr);
    int max = max(arr);
    System.out.println("The minimum element in array is : "+min);
    System.out.println("The Maximum element in array is : "+max);
  }
 
  public static int min(int[] arr){
    int i = 0;
    int min = arr[0];
    while(i < arr.length){
      if(min > arr[i]){
        min = arr[i];
      }
      i++;
    }
    return min;
  }


  public static int max(int[] arr){
    int i = 0;
    int max = arr[0];
    while(i < arr.length){
      if(max < arr[i]){
        max = arr[i];
      }
      i++;
    }
    return max;
  }


}