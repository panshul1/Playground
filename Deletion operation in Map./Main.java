import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int inserted = Integer.parseInt(br.readLine());
      System.out.println("Enter the number of values to be inserted in map:"+inserted);
      TreeMap<String,String> tr = new TreeMap<String,String>();
      for(int i=0;i<inserted;i++)
      {
        tr.put(br.readLine(),br.readLine());
      }
      System.out.println(tr);
      String r=br.readLine();
      System.out.println("Enter the index to be removed:"+r);
      tr.remove(r);
      System.out.println(tr);
     String index= br.readLine();
      String value=br.readLine();
      System.out.println("Enter the index to insert:"+index);
      System.out.println("Enter the value to be inserted:"+value);
      tr.put(index,value);
      System.out.println(tr);
      
      
    }
}