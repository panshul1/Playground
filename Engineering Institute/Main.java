//import required packages
import java.util.Scanner;
class Faculty
{
  public int bases;
  public void salary()
  {
    System.out.println("Base Salary: "+bases);
    //write your Faculty class statements
  }
}
class CSE extends Faculty
{
  public void salary()
  {
    //write your CSE class statements
    System.out.println("CSE Faculty: "+(this.bases+3000));
  }
}
class IT extends Faculty
{
  public void salary()
  {
    //write your IT class statements
  System.out.println("IT Faculty: "+(this.bases+5000));
  }
}
class ECE extends Faculty
{
  public void salary()
  {
    //write your ECE class statements
    System.out.println("ECE Faculty: "+(this.bases+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int base= in.nextInt();
    Faculty fac = new Faculty();
    fac.bases=base;
    ECE obj = new ECE();
    IT it = new IT();
    CSE cse = new CSE();
    it.bases=base;
    cse.bases=base;
    obj.bases=base;
    fac.salary();
    cse.salary();
    it.salary();
    obj.salary();
    
    
    
    
    
    //implement your required concept here
  }
}