import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner c = new Scanner(System.in);
    int r = c.nextInt();
    int co = c.nextInt();
    int arr[][] = new int[r][co];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<co;j++)
      {
        arr[i][j]=c.nextInt();
      }
    }
    for(int i = co-1;i>=0;i--)
    {
      for(int j =0;j<r;j++)
      {
        System.out.print(arr[j][i]+" ");
      }
      System.out.println();
    }
    
  }
}