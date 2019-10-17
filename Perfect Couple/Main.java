import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner c = new Scanner(System.in);
      int s = c.nextInt();
      int arr[]= new int[s];
      for(int i=0;i<s;i++)
      {
        arr[i]=c.nextInt();
      }
      int value =c.nextInt();
      for(int j=0;j<s;j++)
      {
        
        for(int k=j+1;k<s;k++)
        {
         
          if(arr[j]+arr[k]==value)
          {
           System.out.print(arr[j]+","+" "+arr[k]);
          System.out.println();
          }
          
       
        
       
        }
    }
}}