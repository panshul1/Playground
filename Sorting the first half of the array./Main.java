import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner c = new Scanner(System.in);
    int n = c.nextInt();
    int arr[]= new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=c.nextInt();
    }
    int m=n/2;
    bubble(m,arr);
    for(int  j=0;j<n;j++)
      System.out.print(arr[j]+" ");
  }
  public static void bubble(int s, int arr[])
  {
    for(int k =0;k<=s-2;k++)
    {
      for(int l=0;l<=s-2-k;l++)
      {
        if(arr[l]>arr[l+1])
        {
          int temp = arr[l];
          arr[l]=arr[l+1];
          arr[l+1]=temp;
        }
      }
    }
  }
  
}