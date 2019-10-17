import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner c = new Scanner(System.in);
      int s = c.nextInt();
      int arr[]= new int[s];
      for(int i=0;i<s;i++)
      {
        arr[i]=c.nextInt();
      }
      boolean m ;
      for(int j=1;j<=s;j++)
      {
        m=true;
        for(int k=0;k<s;k++)
        {
          if(arr[k]==j)
            m=false;
        }
        if(m==true)
          System.out.print(j);
      }
          
          
        
        
        
        
        
        
        
        
        
    }
}