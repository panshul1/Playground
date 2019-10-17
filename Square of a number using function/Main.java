import java.util.Scanner;
class Main
{
  public static int square(int num)
  {
    int r = num*num;
    return(r);
  }
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner c = new Scanner(System.in);
      int n = c.nextInt();
      int sqr = square(n);
      System.out.println(sqr);
      
	} 
}