public class find_duplicate {
  public static void main(String[] args) {
    int[] arr = arrayutility.inputarray();
    disDupEle(arr);
  }

  /*the main problem in this is code is it ignore the 
   * zero value in the loop 
   * this is only reaming part of the code
   */
  public static void disDupEle(int[] arr){
    int i =0;
    int[] printedNum = new int[arr.length/2];
    int l =0;
   
    while(i < arr.length){ 
      int j = i+1; 



      while(j < arr.length){
       // System.out.println(arr[i]+" == "+arr[j]+" && "+isOcc(printedNum, arr[i]));


        if(arr[i] == arr[j]&& isOcc(printedNum, arr[i])){



          
        System.out.println(arr[i]);
        printedNum[l] = arr[i];
        l++;

        break;
        }
        j++;
      }




      i++;
    }
  
  }

  public static boolean isOcc(int[] arr, int num ){
    int i = 0;
    while(i < arr.length){
      if(arr[i]==num){
        return false;

      } 

      i++;
    }



    return true;
  }
 
}
