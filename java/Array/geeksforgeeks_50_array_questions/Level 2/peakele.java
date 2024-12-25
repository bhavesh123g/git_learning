public class peakele {
  public static void main(String[] args) {
    int[] arr = arrayutility.inputarray();

  }
  public static int findPeakEle(int[] arr){
    int pele = 0;

    int i = 0; 
    while(i < arr.length){

      if(i == 0 && i == max(arr)){
        return i;
      }
      if(i == arr.length-1&& i == max(arr)){
        return i;
      }
      if(i > 1 && arr[i]>= arr[i-1] && arr[i] >= arr[i+1] )

      
    i++;
    }


    return pele;
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
