import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner c = new Scanner(System.in);
    int r = c.nextInt();
    int co = c.nextInt();
    int arr[][]=new int[r][co];
    int trr[][]= new int[co][r];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<co;j++)
      {
        arr[i][j]=c.nextInt();
        trr[j][i]=arr[i][j];
      }
      
  }
       for(int i=0;i<r;i++)
    {
      for(int j=0;j<co;j++)
      {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
       }
  }
}