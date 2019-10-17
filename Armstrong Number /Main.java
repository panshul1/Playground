import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner c= new Scanner(System.in);
      int n = c.nextInt();
      int count =1;
      int n1=n;
      int n2=n;
      int n3;
      int s;
      double sum=0;
      while(n1>=10)
      {
        n1=n1/10;
        count++;
      }
      while(n2>=10)
      {
        n3=n2%10;
        n2=n2/10;
       sum = sum+ Math.pow(n3,count);
        
      }
      sum = sum + Math.pow(n2,count);
      if(sum==n)
      {
        System.out.println("Armstrong Number");
      }
      else
        System.out.println("Not a Armstrong Number");
        
	}
}