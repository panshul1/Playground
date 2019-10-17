import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner c = new Scanner(System.in);
    int s = c.nextInt();
    int arr[] = new int[s];
    for(int i=0; i<s;i++)
    {
      arr[i]=c.nextInt();
    }
    int l =arr[0];
    for(int i=1;i<s;i++)
    {
      if(l<arr[i])
        l=arr[i];
    }
    for(int j=0;j<s;j++)
    {
      if(l==arr[j])
      {
        System.out.println(j);

      
      }
    }
      
      
     
  }
}