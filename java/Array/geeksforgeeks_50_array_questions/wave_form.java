public class wave_form {
  public static void main(String[] args) {
    int[] arr = arrayutility.inputarray();
    printWaveArr(arr);



  }
  public static void printWaveArr(int[] arr){
   sort.sortarrinc(arr);
    int i = 0; 
    while (i < arr.length-1){

      arrayutility.swap(arr,i, i+1);

      i = i+2;
    }


    arrayutility.displayArr(arr);
  }
  
}
