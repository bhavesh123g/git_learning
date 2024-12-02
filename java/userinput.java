import java.util.Scanner;

public class userinput {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("please enter your name : ");
    String name = input.nextLine();
    System.out.println("Good Morning "+name);
    System.out.print(name+", also tell me your age : ");
    int age = input.nextInt();
    System.err.println("Your age is "+age);
  }
}
