import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner c = new Scanner(System.in);
    int s = c.nextInt();
    int arr[]= new int[s];
    for(int i=0;i<s;i++)
    {
      arr[i]=c.nextInt();
    }
    int r =s/3;
   
    int sum[] = new int[r];
    for(int j=0; j<r ; j++)
    {
       
      for(int k=3*j ; k<=3*j+2;k++)
      {
         sum[j] = sum[j] + arr[k];
      }
      
    }
    int d =0;
    for( int i=0 ;i<r;i++)
    {
      if(sum[0]!=sum[i])
        d=1;
    }
    if(d==0)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
      
  }
}
     