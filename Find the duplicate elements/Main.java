import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     // type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      TreeSet<String> tr = new TreeSet<String>();
       String month = br.readLine();
        String[] arr = month.split(",");
          System.out.println("Duplicate Entry is: ");
           for(int i = 0;i<arr.length;i++)
                        {
                            if(!tr.add(arr[i]))
                            {
                              System.out.println(arr[i]);
                                                                           
                              }                                            
                              
                        }
     
        System.out.println("TreeSet is : "+tr);
    }
}