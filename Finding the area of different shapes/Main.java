import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner c = new Scanner(System.in);
      int choice = c.nextInt();
      switch(choice)
      {
        case 1:
             int side = c.nextInt();
             System.out.print(side*side);
              break;
        case 2:
             int len = c.nextInt();
             int br = c.nextInt();
             System.out.println(len*br);
             break;
        case 3:
            int base = c.nextInt();
            int height =c.nextInt();
            int area = base*height;
            System.out.print(area/2);
            break;
        case 4:
          int radius = c.nextInt();
          System.out.print(3.14*radius*radius);
          break;
      }
    }
}