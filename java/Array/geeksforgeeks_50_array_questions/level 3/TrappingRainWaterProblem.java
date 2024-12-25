public class TrappingRainWaterProblem {
  public static void main(String[] args) {
    int[] arr = arrayutility.inputarray();
    System.out.println(waterCount(arr));
  }

  public static int waterCount(int[] arr){
    int count = 0;
    int i = 1;
    int j = 1;
    int left = arr[0];
    int leftindex = 0;
    while (i < arr.length) {
      if(arr[i] >= left){
        while(j < i){
          count = count +left-arr[j];
          j++;
        }
        leftindex = i;
        left = arr[i];
      }
      i++;
    }
   
    
    
    if(leftindex != arr.length-1){
      //System.out.println("reaming");
      arrayutility.arrRevFromIndex(arr, leftindex);
      //arrayutility.displayArr(arr);
       i = j;
       left = arr[j];
       leftindex = j;
      //  System.out.println(i);
      //  System.out.println(j);
      //  System.out.println(arr[i]);

       while (i < arr.length) {
        if(arr[i] >= left){
          while(j < i){
            count = count +left-arr[j];
            j++;
          }
          leftindex = i;
          left = arr[i];
        }
        i++;
      }
 
     }
    //  System.out.println("i : "+i);
    //  System.out.println("j : "+j);
    //  System.out.println("left : "+left);
    //  System.out.println("leftindex : "+leftindex);
    //  System.out.println("arr.length : "+arr.length);
 



    return count;
  }
}