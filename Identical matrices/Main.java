

import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here
    Scanner c = new Scanner(System.in);
    int r = c.nextInt();
    int co = c.nextInt();
    int arr1[][] = new int[r][co];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<co;j++)
      {
        arr1[i][j]=c.nextInt();
      }
    }
    int arr2[][] = new int[r][co];
       for(int i=0;i<r;i++)
    {
      for(int j=0;j<co;j++)
      {
        arr2[i][j]=c.nextInt();
      }
    }
    int f =0;
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<co;j++)
      {
        if(arr1[i][j]!=arr2[i][j])
          f=1;
      }
    }
    if(f==1)
      System.out.print("No");
    else
      System.out.print("Yes");
      
  }
}