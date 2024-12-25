import java.util.Scanner;

public class sort2darray {
   
  public static void main(String[] args) {
    int[][] arr = arrayutility.input2Darray();
    sortarr(arr);
    arrayutility.display2Drr(arr);
  }
  public static int[][] sortarr(int[][] arr){
  
    int r = 0;

    while(r < arr.length){
     
      int c = 0; 
      while( c < arr[0].length){
        // System.out.println("position : "+arr[r][c]);
        // this is inner block 
        int r2 = r;
        int c2= c+1;
        while(r2 < arr.length){
          while (c2 < arr[0].length) {
            //swap
            if(arr[r][c] > arr[r2][c2]){
              int swap = arr[r][c];
              arr[r][c] = arr[r2][c2];
              arr[r2][c2] = swap;
            }
            //System.out.println(arr[r2][c2]);
            //swap
            c2++;
          }
          r2++;
          c2=0;
        }
        //this is inner block
        c++;
      }
    r++;
    }
    return arr;
  }
}
