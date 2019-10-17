import java.util.Scanner;
class Main{
  public static void main(String args[]) {
Scanner c = new Scanner(System.in);
    char y = c.next().charAt(0);
    int key = c.nextInt();
    if(y>='a'&& y<='z')
    {
      int offset = y - 'a';
      
      if((offset - key)<0)
      offset=  (offset-key+26)%26;
      else
        offset =(offset-key)%26;
      
       int r =offset +'a';
      y = (char)r;
    }
    
     if(y>='A'&& y<='Z')
    {
      int offset = y - 'A';
      
      if((offset - key)<0)
      offset=  (offset-key+26)%26;
      else
        offset =(offset-key)%26;
      
       int r =offset +'A';
      y = (char)r;
    }
    System.out.print(y);
  }
}
