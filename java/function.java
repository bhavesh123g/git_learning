public class function {
  public static void main(String[] args) {
    

pattern1();
pattern2();
pattern3();






  }
  public static void pattern1(){
    int row = 0; 
    while(row < 5){
      System.out.print("*");
      int i = 0;
      while(i < row){
        System.out.print(" *");
        i++;
      }
      System.out.println("");
      row++;
    }
  }
  public static void pattern2(){
    int row = 5; 
    while(row > 0){
      System.out.print("*");
      int i = 1;
      while(i < row){
        System.out.print(" *");
        i++;
      }
      System.out.println("");
      row--;
    }
  }

  public static void pattern3(){
    int row = 0; 
    while(row < 5){
      int k = row;
      while(k < 4){
        System.out.print("  ");
        k++;
      }
      System.out.print("*");
      int i = 0;
      while(i < row){
        System.out.print(" *");
        i++;
      }
      System.out.println("");
      row++;
    }
  }
}

    


