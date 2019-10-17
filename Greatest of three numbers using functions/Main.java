import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner c = new Scanner(System.in);
      int n1 = c.nextInt();
      int n2 = c.nextInt();
      int n3 = c.nextInt();
      int r = greater(n1,n2);
      int t = greater(r,n3);
      System.out.println(t);
      
	}
  public static int greater( int n , int m)
  {
    if(n>m)
      return(n);
    else
    return(m);
  }
}