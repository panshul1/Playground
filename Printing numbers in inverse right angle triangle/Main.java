import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner c = new Scanner(System.in);
      int n = c.nextInt();
      for(int i=0;i<n;i++)
      {
        for(int j=n-i;j>=1;j--)
        {
          System.out.print(j);
        }
        System.out.println();
      }
	}
}