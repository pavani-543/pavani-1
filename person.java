class person{
{
 public final string getName()
 {
  return "person";
  }
  }
  class persondetails extends person
  {
  public final string getName()
  {
   return"person details";
   }
   //compilation error because overiden method is final
   }
