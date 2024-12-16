public class find_duplicate {
  public static void main(String[] args) {
    int[] arr = arrayutility.inputarray();
    
    findDupEle(arr);
  }
  public static void findDupEle(int[] arr){
    int i = 0; 
    while(i < arr.length){
    //System.out.println(i);
    int j = i+1;
    while(j < arr.length){  
   //System.out.println("   "+j);
   if(arr[i] == arr[j]){
    System.out.println(arr[i]);
    break;
   }
   
    j++;
    }
      i++;
    }

    
  }
}
