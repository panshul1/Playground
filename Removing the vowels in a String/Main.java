import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner c = new Scanner(System.in);
    String s=c.nextLine();
    StringBuilder n = new StringBuilder(); 
    int len=s.length();
    char arr[] = new char[5];
    arr[0]='a';
    arr[1]='e';
    arr[2]='i';
    arr[3]='o';
    arr[4]='u';
    for(int i=0;i<len;i++)
    {
        int p=0;
      for(int j =0 ;j<5;j++)
      {
        if(s.charAt(i)==arr[j])
          p=1;
      }
      if(p==0)
        n.append(s.charAt(i));
    }
    System.out.print(n);
        
    
   
    
           
  }
}