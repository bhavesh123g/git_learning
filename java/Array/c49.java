//. Create a program to do sum and average of all elements in a 2-D array
public class c49 {
  public static void main(String[] args) {
    ArrayUtility.greet();
    int[][] arr = ArrayUtility.input2Darray();
    int sum = sum2Darr(arr);
    float avg = avg2Darr(arr);
    System.out.println("The sum of all the elements in 2-D array is : "+sum);
    System.out.println("The avg of all the elements in 2-D array is : "+avg);
  }
  public static int sum2Darr(int[][] arr){
    int sum = 0;
    int r = 0; 
    while(r < arr.length){
      int c = 0;

      while(c < arr[r].length){
        sum = sum +arr[r][c];
        c++;
      }
      r++;
    }

    return sum;
  }
  public static float avg2Darr(int[][] arr){
  
    int num = arr.length+arr[1].length;
    float avg = sum2Darr(arr);
    avg = avg/num;
    


    return avg;
  }
}
