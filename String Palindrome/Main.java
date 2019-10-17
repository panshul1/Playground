import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner c = new Scanner(System.in);
      String n = c.nextLine();
      StringBuilder kb = new StringBuilder(n);
      int len = n.length();
      String k = new String();
      StringBuilder sb = new StringBuilder(k);
      for(int i= len-1; i>=0;i--)
        sb.append(n.charAt(i));
      int r =0;
      for(int j= len-1;j>=0;j--)
        
      {if(sb.charAt(j)==kb.charAt(j))
          r++;
      }
      if(r==len)
        System.out.print("Yes");
      else
        System.out.print("No");


         
    
       
      
    } 
}