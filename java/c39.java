public class c39 {
  public static void main(String[] args){

    pattern3();
  }
  public static void pattern1(){
    int i = 1; 
    while (i <= 5){
      System.out.print("*");
      int j = 1;
      while (j <i){
        System.out.print(" *");
        j++;
      }
      i++;
      System.out.println("");
    }
  }

  public static void pattern2(){
    int i = 5; 
    while (i >= 1){
      System.out.print("*");
      int j = 1;
      while (j <i){
        System.out.print(" *");
        j++;
      }
      i--;
      System.out.println("");
    }
  }




  public static void pattern3(){
    int i = 1; 
    while (i <= 5){
      int k = i;
      while(k < 5){
        System.out.print("  ");
        k++;
      }
      System.out.print("*");
      int j = 1;
      while (j <i){
        System.out.print(" *");
        j++;
      }
      i++;
      System.out.println("");
    }
  }
}
