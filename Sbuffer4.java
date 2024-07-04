import java.lang.*;
class Sbuffer4
{
 public static void main(String args[])
{
 StringBuffer sb=new StringBuffer("i love my country");
sb.delete(0,5);
System.out.println(sb);
sb.deleteCharAt(3);
System.out.println(sb);
 }
}