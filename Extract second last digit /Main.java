import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner c = new Scanner(System.in);
      int n1 = c.nextInt();
      int n2 = (n1%100)/10;
      System.out.println(n2);
	}
}