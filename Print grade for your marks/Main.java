import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner c =  new Scanner(System.in);
      int mrks = c.nextInt();
      if(mrks>=85)
      {
        System.out.println("A");
      }
      else if(85>=mrks && mrks>=75)
      {System.out.println("B");
      }
       else if(75>=mrks && mrks>=65)
       {System.out.println("C");
        
       }
       else if(65>=mrks && mrks>=55)
       {
         System.out.println("D");
       }
      else if(55>=mrks && mrks>=45)
      {
        System.out.println("E");
      }
      else if(45>mrks)
      {
        System.out.println("Fail");
      }
        
        
      
         
      
         
    }
}