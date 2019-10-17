import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashSet  lr = new LinkedHashSet();
        
      String month = br.readLine();
                        String[] arr = month.split(",");
                        for(int i = 0;i<arr.length;i++)
                        {
                            lr.add(arr[i]);
                        }
      
        System.out.println(lr);
      String rem = br.readLine();
      System.out.println("Enter the value to be deleted: "+rem);
      
      lr.remove(rem);
      System.out.println(lr);
      double ad = Double.parseDouble(br.readLine());
      System.out.println("Enter the value to be added: " +ad);
      
      lr.add(ad);
       System.out.println(lr);
      
      
      
                         
      
    }
}