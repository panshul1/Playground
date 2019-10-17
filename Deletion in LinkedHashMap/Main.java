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
      LinkedHashMap<String,String> lr = new LinkedHashMap<String,String>();
      for(int i=0;i<inserted;i++)
      {
        lr.put(br.readLine(),br.readLine());
      }
      System.out.println(lr);
      String r=br.readLine();
      System.out.println("Enter the index to be removed:"+r);
      lr.remove(r);
      System.out.println(lr);
      System.out.println("Size of map is : "+lr.size());
      
    }
}