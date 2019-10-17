class MyModel1 {
     //write your logic here
  public int camera= 2;
  public void display()
  {
    System.out.println("Features of MyModel 1");
    System.out.println("Camera mega pixels: "+camera);
}
}
class MyModel2 extends MyModel1 {
     //write your logic here
  public int camera = 5;
  public String lock ="Fingerprint";
  public int display =5;
  public void display()
  {
    System.out.println("Features of MyModel 2");
    System.out.println("Camera mega pixels: "+camera);
    System.out.println("Lock mechanism: "+lock);
    System.out.println("Display size: "+display);
  }
}
class MyModel2T extends MyModel2 {
     //write your logic here
    public int camera = 16;
  public String lock ="Fingerprint";
  public int display =6;
  public void display()
  {
    System.out.println("Features of MyModel 2T");
    System.out.println("Camera mega pixels: "+camera);
    System.out.println("Lock mechanism: "+lock);
    System.out.println("Display size: "+display);
  }
}
public class Main 
{
    public static void main(String[] args) 
    {
      MyModel1 m1 = new MyModel1();
      MyModel1 m2 = new MyModel2();
      MyModel1 m3 = new MyModel2T();
      m1.display();
      m2.display();
      m3.display();
          //write your logic here
    }
}