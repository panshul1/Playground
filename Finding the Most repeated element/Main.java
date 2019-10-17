 import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner c = new Scanner(System.in);
    int s=c.nextInt();
    int arr[]=new int[s];
    for(int i=0;i<s;i++)
      arr[i]=c.nextInt();
    int tp[]=new int[s];
    int g=0;
    for(int j=0;j<s;j++)
    {
      int count =0;
      for(int k=0;k<s;k++)
      {
        if(arr[j]==arr[k])
          count++;
      }
      tp[g]=count;
      g++;
    }
    int max=tp[0];
    for(int l=0;l<s;l++)
    {
      if(max<tp[l])
        max=tp[l];
    }
    if(max!=1)
    System.out.print(arr[max]);
    else
      System.out.print(arr[0]);
      
      
          
  }
}