//import java.lang.reflect.Array;
import java.util.*;



public class assn7 {
   public static void main(String[] args)
   {
      Scanner input=new Scanner(System.in);
      System.out.println("Enter the number of elements");
      int n=input.nextInt();
      //int a[]=new int[n];
      ArrayList<Integer> arr=new ArrayList<Integer>(n);
      ArrayList<String> list=new ArrayList<String>(n);
      
      for(int i=0;i<n;i++) 
      {
          int k=input.nextInt();
          arr.add(k);
          //a[i]=input.nextInt();
      } 

      int ev=0,od=0,prim=0,palin=0;
      for(int i=0;i<n;i++) 
      {
          if(arr.get(i)%2==0) 
          {
              ev++;
              if(isPalindrome(arr.get(i))) {System.out.println(arr.get(i)+" is even and " + "Palindrome"); palin++;}
              else System.out.println(arr.get(i)+" is even ");
          }
          else if(arr.get(i)%2==1) 
          {
              od++;
             if(isPalindrome(arr.get(i)) && isPrime(arr.get(i))) {System.out.println(arr.get(i)+ " is odd and " + "Palindrome" + "Prime"); palin++; prim++;}
             else if(isPalindrome(arr.get(i))) {System.out.println(arr.get(i)+" is odd and " + "Palindrome" ); palin++; }
             else if(isPrime(arr.get(i))) {System.out.println(arr.get(i)+" is odd and " + "Prime" ); prim++; }
             else {System.out.println(arr.get(i)+" is odd and "  );  }
          }
          
      }
      System.out.println("The number of odd are :" + od);
      System.out.println("The number of even are :" + ev);
      System.out.println("The number of prime are :" + prim);

   } 
   public static boolean isPalindrome(int x) 
   {
       int k=0;
       int t=x;
      
       while(x>0) 
       {
           int rem=x%10;
           x=x/10;
           k=k+rem*10;
           
       }
       if(k==t)  return true;
       else return false;
   } 
   public static boolean isPrime(int x)
   {
        for(int i=2;i<x;i++) 
        {
            if(x%i==0) return false;
        }
        return true;
   }
}
