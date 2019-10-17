import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner c = new Scanner(System.in);
    int s = c.nextInt();
    int arr[]= new int[s];
    for(int i=0;i<s;i++)
      arr[i]=c.nextInt();
    for(int i =0;i<s;i++)
    {
      for(int j=0+i;j<s;j++)
      {
        if(arr[i]<arr[j] && arr[j-1]<arr[j])
          System.out.println(arr[i]+","+""+arr[j]);
      }
    }
  }
}