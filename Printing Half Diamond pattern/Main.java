import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner c = new Scanner(System.in);
      int n = c.nextInt();
      for(int i=1; i<=n ;i++)
      {
        for(int j=1;j<=n-i; j++)
        {
          System.out.print(" ");
        }
        int l=i-1;
        for(int k =1 ; k<=2*l+1 ; k++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
          
	}
}