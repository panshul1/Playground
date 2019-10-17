import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner c = new Scanner(System.in);
      int s =c.nextInt();
      int k =c.nextInt();
      int arr[]=new int[s];
      for(int i=0;i<s;i++)
      {
        arr[i]=c.nextInt();
      }
      for(int j=1;j<=k;j++)
        { int count =0;
          for(int l=0;l<s;l++)
          {
            if(j==arr[l])
              count++;
          }
         System.out.println(j+" "+count);
        }
        
    }
}