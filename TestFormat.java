import  java.text.DecimalFormat;
public class TestFormat{
  public static void main(String args[]){
    DecimalFormat df = new DecimalFormat(".###");
    double value= 12.361672;
    System.out.println("Original value="+ value);
    System.out.println("value after formating="+ df.format(value));
  }
}