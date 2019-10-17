import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner c = new Scanner(System.in);
      int base = c.nextInt();
      int exp = c.nextInt();
      int ans =1;
      while(exp>0)
      {
        ans = ans*base;
        exp--;
      }
      System.out.println(ans);
    }
}