import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here 
      Scanner c = new Scanner(System.in);
      String s = c.nextLine();
      StringBuilder sb = new StringBuilder(s);
      String r = c.nextLine();
      String i = c.nextLine();
      int ls =s.length();
      int rs =s.length();
         int strt=0;
      for(int j=0;j<ls;j++)
      {
     
        if(s.charAt(j)==' ')
        {
        if(s.substring(strt,j).equals(r))
        System.out.print(s.replace(r,i));
        strt =j+1;
        }
      }
        if(s.substring(strt,ls).equals(r))
        {
          System.out.print(s.replace(r,i));
        }
                           
      }
                           
        
      
    
}