import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner c =new Scanner(System.in);
    int n1 = c.nextInt();
    int n2 = n1/100;
    int n3 =((n1/10)%10)*10;
    int n4 = (n1%10)*100;
    int n5 = n4+n3+n2;
    System.out.println(n5);
  }
}