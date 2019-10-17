import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
      // type your code here
     Scanner in = new Scanner(System.in);
     if(in.hasNextInt())
       System.out.println(in.nextInt());
     else
       System.out.println("Input Mismatch Exception occurred");
     
     
   }
}