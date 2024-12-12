//Create a program to merge two sorted arrays.
public class c47 {
  public static void main(String[] args) {
    ArrayUtility.greet();
    int[] arr1 = ArrayUtility.inputarray(), arr2 = ArrayUtility.inputarray();
    int[] mergearr = mergearr(arr1, arr2);
    Sarr(mergearr);
    System.out.println("This is sorted array");
  
    ArrayUtility.displayArr(mergearr);

  }

 
  public static int[] Sarr(int[] arr){
    int min;
    int i = 0;
    while(i < arr.length){
      min = arr[i] ;
      int j = i;
      while(j < arr.length){
      if(min > arr[j]){
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j]= swap;
        min = arr[i];
      }
      j++;
    }

      i++;
    }


    return arr;
  }

  public static int[] mergearr(int[] arr1, int[] arr2){
    int[] marr = new int[arr1.length+arr2.length];
    int i = 0;
    while( i < arr1.length){
      marr[i]=arr1[i];
      i++;
    }
     int j = 0;
     while(j < arr2.length){
      marr[i]= arr2[j];
      i++;
      j++;
     }


    return marr;
  }



}
