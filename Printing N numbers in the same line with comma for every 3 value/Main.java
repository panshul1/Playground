import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner c = new Scanner(System.in);
    int n = c.nextInt();
    int m =3;
    for(int i=1;i<=n;i++)
    {
      System.out.print(i);
      if(i%m==0)
        System.out.print(",");
    }
  }
}