import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
       Scanner c = new Scanner(System.in);
      int n1 = c.nextInt();
      int n2 = c.nextInt();
      int n3 = c.nextInt();
      int r = gcd(n1,n2);
      int t = gcd(r,n3);
        System.out.println(t);
	}
  public static int gcd( int n ,int m)
  {
    if(n>m)
    {
      while(m!=1)
      {
        if(n%m==0)
          break;
        else
          --m;
      }
      return(m);
    }
    else
          {
      while(n!=1)
      {
        if(m%n==0)
          break;
        else
          --n;
      }
      return(n);
    }
  }
      
      
}