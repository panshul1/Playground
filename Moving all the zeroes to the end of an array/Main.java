import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner c = new Scanner(System.in);
      int s = c.nextInt();
      int arr[] = new int[s];
      for(int i=0;i<s;i++)
      {
        arr[i]=c.nextInt();
      }
      int count =0;
      int k;
      for( k = 0 ;k<s  ;k++)
      {
        if(arr[k]==0)
          count++;
        else
          System.out.print(arr[k] +" ");
        
      }
       for(int j = 1 ;j<=count;j++)
      {
        System.out.print("0"+" ");
       }
    
     
    }
  
}