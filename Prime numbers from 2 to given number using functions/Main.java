import java.util.Scanner;
class Main{
  static boolean isPrime(int n) 
    { 
        // Corner case 
        if (n <= 1) 
            return false; 
       
        // Check from 2 to n-1 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
       
        return true; 
    } 
	public static void main (String[] args){
	    // Type your code here
      Scanner c = new Scanner(System.in);
      int n= c.nextInt();
      for(int j =2 ; j<=n ; j++)
      {if( isPrime(j))
          System.out.println(j);
      }      
	}
}