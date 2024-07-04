import java.lang.*;
class StringEx3
{
 public static void main(String args[])
 {
  String str1="welcome";
  String str2="welcomeindia";
  System.out.println(str1.compareTo(str2));
  /* since str2 contains 6characters less than str1,outshould be-6*/
  System.out.println(str2.compareTo(str1));
  /*since str2 contains 6characters less than the str1,output should be 6*/
  }
  }