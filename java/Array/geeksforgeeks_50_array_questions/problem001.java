//Given a binary 2D array, where each row is sorted. Find the row with the maximum number of 1s. 

// 24 min to solve this 
/*
                        0 1 1 1
                        0 0 1 1
                        1 1 1 1 
                        0 0 0 0

                        0 0 1 1
                        0 1 1 1
                        0 0 1 1  
                        0 0 0 0
 
 */
public class problem001 {
  public static void main(String[] args) {
    int[][] arr = arrayutility.input2Darray();
    System.out.println(findMaxRow(arr));

  }
  public static int findMaxRow(int[][] arr){
    int maxrow = 0;
    int maxcount = 0;
    int i = 0; 
    while (i < arr.length) {
      int j = 0;
      int count = 0;
      while(j < arr[0].length){
        if(arr[i][j] == 1){
         
          count++;
        }
        j++;
      }
     
      if(count >= maxcount){
        maxrow = i;
        maxcount = count;
      }
     
      i++;
    }





    return maxrow+1;
  }
  
}
