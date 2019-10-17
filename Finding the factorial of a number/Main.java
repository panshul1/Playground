import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner c = new Scanner(System.in);
    int n = c.nextInt();
    System.out.print(fact(n));
  }
    public static int fact(int r)
    {
      if(r==1)
        return(1);
      else
        return(r*fact(r-1));
    }
      
  
}