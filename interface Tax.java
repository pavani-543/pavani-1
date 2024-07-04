interface Tax
double stateTax();
}
class AP implements Tax
{
 public double stateTax()
 {
  System.out.println("according to AP rules");
  return 5000.56;
  }
  }
  class karnataka implements Tax
  {
   public double StateTax()
   {
    System.out.println("according to karnataka rules");
    return 3000.123;
    }
    }
    class TaxApp
    {
     public static void main(String args[])throws Exception
     {
      Class c=Class.forName(args0]);
      Tax ref=(Tax)c.newIntance();
      calculateTax(ref);
      }
       static void calculate Tax(tax t)
       {
        double ct=100.00;
        double st=t.stateTax();
        System.out.println("total tax:"+(ct+st));
        }
       } 
 