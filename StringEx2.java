import java.lang.*;
class StringEx2
{
 public static void main(String args[]) 
 {
  String s1="welcome";
  String s2="WELCOME";
  System.out.println(s1.equals(s2));//false
  System.out.println(s1.equalsIgnoreCase(s2));//true
  }
 }
 