import java.util.Scanner;
public class TestDoWhile{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Welcome to our 2nd sem Designed Banking system");
    System.out.println("  ");
    int i=1,input,a,b;
    String hint;
    int pin = 3190;
    do{
      System.out.println("Enter your four-digit pin number");
      input = sc.nextInt();
      if(input == pin)
      {
        System.out.println("Welcome!! you can withdraw your money");
        break;
      }
      else
      {
        if(i==1)
        {
         System.out.println("  ");
         System.out.println("Sorry!! wrong pin"); 
         System.out.println("****************************");
         System.out.println("Do you want to take hint Y or N");
         hint = sc1.nextLine();
         if (hint.equals("y"))
         {
         if(pin%2==0)
         {
           System.out.println("Hint!! your pin is even number"); 
         }
         else
         {
           System.out.println("Hint!! your pin is odd number"); 
         }
         }
         else
         {
           System.out.println("Hint not taken");
         }
        }
        else if(i==2)
        {
          System.out.println("  ");
          System.out.println("Sorry!! Wrong pin Again!!" );
          System.out.println("****************************");
          System.out.println("Do you want to take hint Y or N");
          hint = sc1.nextLine();
          if (hint.equals("y"))
         {
          a= pin/1000;
          System.out.println("Your pin start with digit " + a);
         }
         else
         {
           System.out.println("Hint not taken");
         }
        }
        else if(i==3)
        {
          System.out.println("  ");
          System.out.println("Sorry!! Wrong pin!! this is your final chance" );
          System.out.println("****************************");
          System.out.println("Do you want to take hint Y or N");
          hint = sc1.nextLine();
          if (hint.equals("y"))
          {
           a= pin/1000;
           b= pin %10;
          System.out.println("your pin start with digit "+ a +" and end with digit "+ b);
          }
          else
          {
            System.out.println("Hint not taken");
          }
        }
        else
        {
          System.out.println("  ");
          System.out.println("Alert!! This person is thief");
        }
        i++;
      }
    } while (i<=4);
  }
}