import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main{
    public static void main(String args[]){
          // type your code here
      Scanner in = new Scanner(System.in);
      String s = in.nextLine();
      Pattern p = Pattern.compile("(,|and|or| )");
      String arr[] = p.split(s);
      for(String pr: arr)
        System.out.println(pr);
    }
}