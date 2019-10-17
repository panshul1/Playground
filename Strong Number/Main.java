import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner c = new Scanner(System.in);
      int n = c.nextInt();
      int n1 =n;
      int n2;
      int sum = 0;
      int p=1;
      while(n1>=10)
      {
        n2 = n1%10;
        n1 = n1/10;
      for(int i =1;i<=n2;i++)
      {
        p=p*i;
      }
        sum =sum + p;
        p=1;
      }
         for(int i =1;i<=n1;i++)
      {
        p=p*i;
      }
        sum =sum + p;
        p=1;
      if(n==sum)
        System.out.println("Yes");
      else
        System.out.println("No");
        
      
	}
}