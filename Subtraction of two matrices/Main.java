import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
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
    int sum[][] = new int[r][co];
      for(int i=0;i<r;i++)
    {
      for(int j=0;j<co;j++)
      {
        sum[i][j]=arr1[i][j]-arr2[i][j];
       }
     }
        for(int i=0;i<r;i++)
    {
      for(int j=0;j<co;j++)
      {
        System.out.print(sum[i][j]+" ");
       }
          System.out.println();
     } 
  }
}