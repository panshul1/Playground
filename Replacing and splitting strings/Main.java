import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner c = new Scanner(System.in);
      String str1 = c.nextLine();
      String str2 = c.nextLine();
      int l = str1.length();
      int n = c.nextInt();
      StringBuilder sb=new StringBuilder(str1);  
      sb.replace(0,l-1,str2); 
      int l2 = str2.length();
      for(int i =0;i<=l2-1;i++)
      { char ch = str2.charAt(i);
        if(ch==' ')
          System.out.println();
        else
        System.out.print(str2.charAt(i));
      }
    }
}