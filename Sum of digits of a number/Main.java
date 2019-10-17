import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner c = new Scanner(System.in);
      int num = c.nextInt();
      int sum = 0;
      while(num>10)
      {
        sum = sum + (num%10);
        num = num/10;
	}
      sum = sum+num;
      System.out.println(sum);
    }
}