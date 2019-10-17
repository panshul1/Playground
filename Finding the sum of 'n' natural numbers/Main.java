import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner c = new Scanner(System.in);
      int n = c.nextInt();
      System.out.print(add(n));
    }
  public static int add(int r)
  {
    if(r==0)
      return(0);
    else
      return(r+add(r-1));
  }
}
    
