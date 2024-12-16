public class sort {
  public static void main(String[] args) {
    int[] arr = arrayutility.inputarray();
    sortarrinc(arr);
    arrayutility.displayArr(arr);
  }
  public static int[] sortarrinc(int[] arr){

    int i = 0; 
    while(i < arr.length){
      //System.out.println(i);

      int j = i+1;
      while(j < arr.length){
        //System.out.println("   "+j);
      if(arr[i] > arr[j]){
        int swap = arr[i];
        arr[i]= arr[j];
        arr[j]= swap;

      }
        j++;
      }
      i++;
    }



    return arr; 
  }
}
