import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList  lr = new ArrayList();
        
      String month = br.readLine();
                        String[] arr = month.split(",");
                        for(int i = 0;i<arr.length;i++)
                        {
                            lr.add(arr[i]);
                        }
      
        System.out.println(lr);
      System.out.println("Size of the linked list: "+lr.size());
      System.out.println("Is LinkedList empty? "+lr.isEmpty());
      String f = br.readLine(); 
      System.out.println("Does LinkedList contains "+f+"?"); 
      System.out.println(lr.contains(f));
    }
}