//Create a program to reverse an array
public class c45 {
  public static void main(String[] args) {
    ArrayUtility.greet();
    int[] myArry = ArrayUtility.inputarray();
    
    revArr(myArry);
    ArrayUtility.displayArr(myArry);
  }


  public static int[] revArr(int[] arr){
    
    int i = 0;
   

    while(i < arr.length/2){

      //System.out.println(i);
      int swap = 0;
      swap = arr[i];
      arr[i] =arr[arr.length-1-i];
      arr[arr.length-1-i]= swap;

      i++;
    }

    return arr;
  }  
}
