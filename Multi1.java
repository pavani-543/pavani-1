//multiple inheritance through interfaces
 interface father
 float ht=6.2f;
 void height();
 }
 interface mother
 {
  float ht=5.2f;
  void height();
  }
  class child implements father,mother
  {
   //child has avarage height of its parents 
   public void height()
  {
   System.out.println("child height="+(father.ht+mother.ht)/2);
   }
  }
  class Multi1
  {
   public static void main(String args[])
   {
    child C=new child();
    c.height();
    }
   }