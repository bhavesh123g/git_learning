public class one_cyclic_rotation {
  public static void main(String[] args) {
    int[] arr = arrayutility.inputarray();
    cyclicallyRotate(arr);
    arrayutility.displayArr(arr); 
   }

  public static int[] cyclicallyRotate(int[] arr){
    int last_ele = arr[arr.length-1];


    int i = arr.length-1;
    while( i > 0){
       arr[i]=arr[i-1];
    

      i--;
    }

    arr[0]= last_ele;
  
    return arr; 
  }
}
