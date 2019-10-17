import java.util.Scanner;
class Main{
  public static int power (int b , int e)
  { int sum =1;
    for(int i=1;i<=e;i++)
    {
       sum = sum*b;
    }
    return(sum);
  }
  
	public static void main (String[] args){
	    // Type your code here
      Scanner c = new Scanner(System.in);
      int base =c.nextInt();
      int exp =c.nextInt();
      int ans = power(base,exp);
      System.out.println(ans);
      
	}
}