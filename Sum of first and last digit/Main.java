import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner c = new Scanner(System.in);
      int num = c.nextInt();
      int n1 = num % 10;
      int n3 = num;
      while( n3>10)
      {
        n3= n3/10;
      }
      int sum = n1 +n3;
      System.out.println(sum);
        
	}
}