import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner c = new Scanner(System.in);
      int n = c.nextInt();
      int n1 = n;
      while(n1>100)
      {
        n1=n1/10;
      }
      int num = n1 % 10;
      System.out.println(num);
	}
}