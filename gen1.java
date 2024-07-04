class Myclass<T>
{
 T obj;
 Myclass(T obj)
 {
  this.obj=obj;
  }
   T getobj()
   {
    return obj;
    }
   }
    class gen1
    {
     public static void main(String args[])
     {
      Integer i=10;
      Float f=23.56f;
      String str="jhon";
      Myclass<Integer>obj1=new Myclass<>(i);
      System.out.println("u stored:"+obj1.getobj());
      Myclass<Float>obj2=new Myclass<>(f);
      System.out.println("u stored:"+obj2.getobj());
       Myclass<String>obj3=new Myclass<>(str);
      System.out.println("u stored:"+obj3.getobj());
       }
      }