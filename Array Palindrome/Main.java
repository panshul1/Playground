import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner c = new Scanner(System.in);
      int s =c.nextInt();
      int arr[] = new int[s];
      for(int i=0;i<s;i++)
      {
        arr[i]=c.nextInt();
        
      }
      int left =0;
      int right =s-1;
      while(left<right)
      {
        if(arr[left]==arr[right])
        {
          left++;
          right--;
        }
       else if(arr[left]!=arr[right])
         break;
      }
      if(arr[left]==arr[right])
       {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
           
      
    }
}