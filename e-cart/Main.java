//import required packages here
import java.util.Scanner;
class Item
{
  public int price;
  public void setmethod(int p)
  {
    this.price=p;
  }
  public int getprice()
  {
    return(this.price);
  }
  //create various method to return attribute value(s)
  
}
   
class Customer
{
  private String product;
  public int quantity;
  public void setquantity(int q)
  {
    this.quantity=q;
    
  }
  public int getquantity()
  {
    return (this.quantity);
  }
  public void setproduct(String s)
  {
    this.product=s;
  }
  //create various method to return attribute value(s)
}

class Bill 
{ Customer customer = new Customer();;
  Item item = new Item();
 public Bill( int price, int quan)
 {
   customer.quantity=quan;
   item.price=price;
 }
  
  
  
  public void price()
  {
    System.out.println("Total Price is : " +(customer.getquantity())*(item.getprice()));
  }
  //implement your logic to calculate total price
}
class Main
{
  public static void main(String[] args)
  {
   
    
    Scanner in = new Scanner(System.in);
    String p = in.nextLine();
    int price = in.nextInt();
    int quan = in.nextInt();
    Bill obj = new Bill( price, quan);
    obj.price();
      
    
    
    //write the logic here
  }
}