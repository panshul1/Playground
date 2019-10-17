import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner c = new Scanner(System.in);
      String s1 = c.nextLine();
      String s2 = c.nextLine();
      int len2 = s2.length();
      String s3 = new String();
      s3 =s1.concat(s1);
      
      int len3 = s3.length();
      boolean m = true;
      

      for(int i=0;i<len3/2;i++)
      {
        if(s3.substring(i,i+len2).equals(s2))
          m=false;
          
      }
      if(m==false)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}