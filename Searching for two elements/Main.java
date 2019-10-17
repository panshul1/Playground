import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner c = new Scanner(System.in);
      int s = c.nextInt();
      int arr [] = new int[s];
      for(int i=0; i<s ; i++)
      {
         arr[i]=c.nextInt();
      }
      int s1 = c.nextInt();
      int s2 = c.nextInt();
      int c1=0;
      int c2=0;
      int j=0;
      int k=0;
      for(j=0; j<s;j++)
      {
        if(s1==arr[j])
        {
         c1=1;
        break;
        }
      
     
      }
   
         for(k=0; k<s;k++){
        if(s2==arr[k])
        { 
          c2=1;
        break;
        }
      }
      
      if(c1==1)
        System.out.println(j);
      if(c2==1)
        System.out.println(k);
      if(c1==0||c2==0)
        System.out.println("-1");
      
    }
}