import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //write your logic here
      Scanner in = new Scanner(System.in);
      String bank = in.next();
      int no = in.nextInt();
      Details detail = new Details();
      if(no==1)
      {
        System.out.println(bank+"-"+detail.notificationBySms());
      }
      if(no==2)
      {
        System.out.println(bank+"-"+detail.notificationByEmail());
      }
      if (no==3)
      {
        System.out.println(bank+"-"+detail.notificationByCourier());
      }
      
    }
}
interface notification
{
  String notificationBySms();
  String notificationByEmail();
  String notificationByCourier();
}
class Details implements notification
{
public String notificationBySms()
{
return("Notification by SMS");
}
public String notificationByEmail()
{
return("Notification by Mail");
}
public String notificationByCourier()
{
return("Notification by Courier");
}
}

