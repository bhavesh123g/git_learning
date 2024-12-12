public class sortarr {
  public static void main(String[] args) {
    ArrayUtility.greet();
    int[] arr = ArrayUtility.inputarray();


    Sarr(arr);
    ArrayUtility.displayArr(arr);
  }

  public static int[] Sarr(int[] arr){
    int min;
    int i = 0;
    while(i < arr.length){
      min = arr[i] ;
      int j = i;
      while(j < arr.length){
      if(min > arr[j]){
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j]= swap;
        min = arr[i];
      }
      j++;
    }

      i++;
    }


    return arr;
  }
  
}
