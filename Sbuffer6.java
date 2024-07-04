import java.lang.*;
class Sbuffer6
{
 public static void main(String args[])
 {
  StringBuffer sb=new StringBuffer();
  System.out.println(sb.capacity());//16
  sb.append("String");
  System.out.println(sb.capacity());//16
  sb.append("i love my country");
  System.out.println(sb.capacity());//34
  sb.append("national bird is peacock");
  System.out.println(sb.capacity());//70
  }
 }