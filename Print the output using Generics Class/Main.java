import java.util.*;
public class Main<T> 
{ 
  // type your code here
  public static void main(String[] args) 
     { 
       // type your code here
       Scanner in = new Scanner(System.in);
       if(in.hasNextInt())
       {
       System.out.println("Integer Value: "+in.next());
       }
       if(in.hasNext())
       {
       System.out.println("String Value: "+in.next());
       }
       if(in.hasNextFloat())
       {
       System.out.println("Float value: "+in.next());
       }
       
       }
 }