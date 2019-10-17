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
      int k =c.nextInt();
      for(int j =0;j<s;j++)
      {
        int count =1;
        for(int l =0;l<s;l++)
        {
          if(arr[j]<arr[l])
             count++;
        }
        if(count==k)
          System.out.print(arr[j]);
      }
    
         
    }   
}