import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner c = new Scanner(System.in);
    String s = c.nextLine();
    StringBuilder str = new StringBuilder();
    int key = c.nextInt();
    int len =  s.length();
    for(int i =0;i<len;i++)
    {
      char ch = s.charAt(i);
      if(ch>='a'&& ch<='z')
      {
        int offset = ch - 'a';
        offset =(offset+(26-key))%26;
        ch = (char)(offset+'a');
      }
      if(ch>='A' && ch<='Z')
      {
        int offset = ch - 'A';
        offset =(offset+(26-key))%26;
        ch = (char)(offset+'A');
      }
      str.append(ch);
    }
    System.out.print(str);
  }
}