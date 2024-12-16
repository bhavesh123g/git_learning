//Create a program to find the sum of two diagonal elements.
public class c50 {
  public static void main(String[] args) {
    ArrayUtility.greet();
    int[][] arr = ArrayUtility.input2Darray();
    int sum = sumDiagonalele(arr);
    System.out.println("The sum of all the digonal elements in 2-D array is : "+sum);
  }
  public static int sumDiagonalele(int[][] arr){
    int sum = 0;
    int r = 0; 
    int size = arr[1].length-1;
    
    while(r < arr.length){
      int c = 0;
      
      while(c < arr[r].length){
        // or we can use sum of r+c == arr[length]-1
        
        if( c == r || c == size-r){
          
        sum = sum +arr[r][c];
        }
        c++;
      }
      r++;
    }

    return sum;
  }
}
