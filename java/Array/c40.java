// Create a program to find the sum and average of all elements in an array.
public class c40 {
  public static void main(String[] args) {


    ArrayUtility.greet();
    int[] myArry = ArrayUtility.inputarray();

    
    System.out.println("The sum of given arrey is "+sumOfArry(myArry));
    System.out.println("The Average of given arrey is "+averageOfArray(myArry));

  }
  
  public static int sumOfArry(int[] myArry){
    int sum = 0; 
    int i = 0; 
    while (i < myArry.length){
      sum = sum + myArry[i];
      i++;
    }
    return sum ;
  }
  public static float averageOfArray(int[] myArry){
    float sum = sumOfArry(myArry);
    return sum/myArry.length;
  }
 
}
