// 12 min to solve this 
public class Majority_Element {
  public static void main(String[] args) {
    int[] arr = arrayutility.inputarray();
    System.out.println(majEle(arr));

  }
  public static int majEle(int[] arr){
    int majel = -1;

    int i = 0;
    while(i < arr.length){
      int j = i;
      int count = 0;
      while(j < arr.length){
       
        if(arr[i] == arr[j]){
        count++;
        }
        j++;
      }
      if(count > arr.length/2){
        return arr[i];
      }
      i++;
    }



    return majel;
  }
  
}
