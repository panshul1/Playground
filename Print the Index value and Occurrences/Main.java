import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
       // type your code here
      Scanner in = new Scanner(System.in);
      String f = in.nextLine();
      String d = in.nextLine();
      Pattern p = Pattern.compile(f);
      Matcher m = p.matcher(d);
       int count =1;
     if( m.find())
     {
       System.out.println("found: "+count+" : "+m.start()+" - "+m.end());
       count++;
       while(m.find())
       
      {
         System.out.println("found: "+count+" : "+m.start()+" - "+m.end());
         count++;
       }
        
       System.out.println(count-1); 
        
      }
        
     
       
        else
          System.out.println("The given word is not present in the string");
      
     
        
    }
}