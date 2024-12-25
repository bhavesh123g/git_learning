public class reverse {
  public static void main(String[] args) {
    
    int[] arr = arrayutility.inputarray();
    
    arrRev(arr);
    arrayutility.displayArr(arr);

  }

  public static int[] arrRev(int[] arr){
    int i = 0; 
    while(i < arr.length/2){
    int swap = arr[i];
    arr[i] = arr[arr.length-i-1];
    arr[arr.length-i-1]= swap;
      i++;
    }



    return arr;
  }
}
