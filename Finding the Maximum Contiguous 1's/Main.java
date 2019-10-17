import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner c = new Scanner(System.in);
      int s =c.nextInt();
      int arr[]=new int[s];
      for(int i=0;i<s;i++)
        arr[i]=c.nextInt();
      int tp[] = new int[s];
      int k=0;
      int count =1;
      for(int i=0;i<s;i++)
      {
        if(arr[i]==1)
          tp[k]=count++;
      else 
      {
        k++;
        count =0;
      }
      }
       int max =tp[0];
      for(int m =1;m<s;m++)
      {
       
        if(max<tp[m])
          max=tp[m];
       
      }
       System.out.print(max);
        
      
    }
}