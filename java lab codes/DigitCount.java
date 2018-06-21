import java.util.Scanner;
public class DigitCount{
  public static void main(String args[])
  {
    String name = ("Dipesh Thakur");
    int b = name.length();
    System.out.println(b);
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter valid number:");
    int num = sc.nextInt();
    int a = Integer.toString(num).length();
    System.out.println("the digit in given num="+a);
  }
}