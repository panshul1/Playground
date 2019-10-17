import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner c = new Scanner(System.in);
      String s = c.nextLine();
      int len =s.length();
      int arr[] = new int[26];
      int offset;
      for(int i=0;i<26;i++)
      {
        arr[i]=0;
      }
      for(int j=0;j<len;j++)
      {
        if(s.charAt(j)>='a' && 'z'>=s.charAt(j))
        {
          offset = s.charAt(j)-'a';
            arr[offset]++;
        }
        if(s.charAt(j)>='A' && 'Z'>=s.charAt(j))
        {
          offset = s.charAt(j)-'A';
          arr[offset]++;
        }
      }
    
        for(int k=0;k<26;k++)
        {
          if(arr[k]==0)
          {
            int  l = k+97;
            char o = (char)l;
           System.out.print(o+" ");
          }
        }
          

          
    }
}