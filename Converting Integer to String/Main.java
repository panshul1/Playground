import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner c = new Scanner(System.in);
    int n = c.nextInt();
    System.out.print(n);
    int r =n;
    int count =0;
    while(n!=0)
    {
      count++;
      n=n/10;
    }

   char arr[] = new char[count];
    count=count-1;
    while(r!=0)
    {
      arr[count]=(char) (r%10 + '0');
         
      r=r/10;
      count--;
    }

 
    
  }
}