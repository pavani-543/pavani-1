import java.lang.*;
class StringEx4
{
 public static void main(String args[])
{
String s1="";
String s2=" ";
System.out.println(s1.compareTo(s2));
/*Since s2 contains one character more than the str1,outputshould be-1*/
System.out.println(s2.compareTo(s1));
/*since S1 contains one character Less than the str2,output should be+1*/
}
}