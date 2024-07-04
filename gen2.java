class Myclass
 {
  static<T>void display(T arr[])
  {
   for(T x:arr)
   System.out.println(x);
   }
  }
  class gen2
  {
   public static void main(String args[])
   {
    Integer iarr[]={11,12,13,14};
    String sarr[]={"mango","apple","orange","kiwi"};
    Myclass.display(iarr);
    Myclass.display(sarr);
    }
   }