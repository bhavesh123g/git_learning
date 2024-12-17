public class wave_form {
  public static void main(String[] args) {
    int[] arr = arrayutility.inputarray();
    printWaveArr(arr);



  }
  public static void printWaveArr(int[] arr){
    int i = 0;
    
   while(i < arr.length){
      int j =i+1;
     

        if (arr[i] < arr[j]) {
          int swap = arr[i];
          arr[i] =arr[j];
          arr[i] = swap;
          
        

        
      }
      i= i +2;
    }



      arrayutility.displayArr(arr);
  }
  
}
