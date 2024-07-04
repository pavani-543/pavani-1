import  java.lang.*;
class StringEx5
{
 public static void main(String args[])
 {
  String s1="india";
  String s2="INDIA";
  System.out.println(s1.compareTo(s2));
  /* the ASCI representation of the Lower and upper case has diffrence of 32*/
   System.out.println(s2.compareTo(s2));
  }
 }