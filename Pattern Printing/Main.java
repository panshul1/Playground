import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner c = new Scanner(System.in);
      int row = c.nextInt();
      int col = c.nextInt();
      for(int i = 0; i<row;i++)
      {
        int pr = row;
        int k=i;
        for(int j = col;j>=1;j--)
        {
          
          if(k>0)
          {
            System.out.print(pr);
            k--;
            pr--;
          }
          else
             System.out.print(pr);
          
        }
        System.out.println();
      }
            
          
      
    }
}