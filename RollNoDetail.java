//extending one interface to another interface
interface RollNodetail
{
 void rollNo();
 }
 interface personDetails extends RollNodetails
 {
  void name();
  }
  class details implements personDetails
  {
   public void name()
   {
    System.out.println("jhon");
    }
    public void rollNo()
    {
     System.out.println("6789");
     }
     public static void main(String args[])
     {
      details d=new details();
      System.out.printl("Name:");
      d.name();
      System.out.println("RollNo:");
      d.rollNo();
      }
      }       