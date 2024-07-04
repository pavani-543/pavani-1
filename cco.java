class Rectangle1
{
 int length;
 int breath;
 Rectangle(int l,int b);
 {
  length=l;
  breath=b;
  }
   Rectangle(Rectangle obj)
   { 
    length=obj.length;
    breath=obj.breath;
    }
    int area()
    {
     return length*breath;
     }
    }
  class ccon
{
 public static void main(String args[])
{
 Rectangle rect=new Rectangle(23,78);
 Rectangle rect1=new Rectangle(rect)
 System.out.println("area of rectangle:"+rect.area());
 System.out.println("area of rectangle:"+rect.area());
 }
 }