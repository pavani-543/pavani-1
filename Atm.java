import java.io*;
import java.lang.*;
class Atm
{
 int mbal=1000;
 Atm(int bal)
 {
  if(bal<=mbal)
  {
   System.out.println("sucessfull withdrawn");
  }
  else
  {
   Atmex e=new Atmex("bal insufficient");
   }
  }
 }
  class Atmex extends Exception
  {
   Atmex(String msg)
  {
   supr(msg);
   System.out.println(msg);
    }
   }
  class SbiAtm
   {
    public static void main(String args[])
    {
     Atm a=new Atm(5000);
    }
   }