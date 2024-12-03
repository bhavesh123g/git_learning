import java.util.Scanner;
public class arrey {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  int[] stud = new int[5];

int i = 0;
  while(i <= 4){
    System.out.print("Enter the marks of roll no "+(1+i)+" : ");
    stud[i]= input.nextInt();
    i++;
  }
  int totalMarks = 0; 
  i = 0;
  while(i <= 4){
   totalMarks = totalMarks + stud[i];
    i++;
  }
  float avgMarks = totalMarks;
  avgMarks = avgMarks/5;
  
  System.out.print("The total marks of all the students is "+avgMarks);
  }
}