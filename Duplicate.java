//write a java to find duplicate characters in a string?
public class Duplicate
{
 public static void main(String args[])
{
 String str=new String("madem");
 int count=0;
 char[] chars=str.toCharArray();
 System.out.println("duplicate characters are:");
 for(int i=0; i<str.length();i++)
 {
  for(int j=i+1;j<str.length();j++)
  {
   if(chars[i]==chars[i])
   {
    Sysatem.out.println(chars[i]);
  count++;
  break;
    }
   }
  }
}