//multiple exceptions
import java.util.scanner;
public static void main(String args[])
{
 scanner sc=new scanner(system.in);
 try
 {
  int n=sc.nextInt();
  if(99%n==0)
  System.out.println(n+"is a factor of 99");
  }
   catch(ArithmaticException ae)
   {
   System.out.println("Arithmatic:"+ae);
   }
   catch(NumberFormatException ex)
   {
   System.out.println("number format exception"+ex);
   }
  }
 
