final class Immutable
{
 final string name;
 final string desg;
 Immutable(String name,String desg)
 {
 this.name=name;
 this.desg=desg;
 }
 public String getName()
 {
  return name;
  }
  public String getDesg()
  {
   return desg;
   }
   }
   class Immex
  {
  public static void main(String args[])
  Immutable obj=new Immutable("jhon","testing");
  System.out.println("name of the person:"+obj.getName());
  System.out.println("designation of the person:"+obj.getDesig());
 }
 }