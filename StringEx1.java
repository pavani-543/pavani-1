class StringEx1
{
 public static void main(String args[])
 {
  String s1="pavani";
  String s2="PAVANI";
  String s3="sowmy";
  String s4="pavani";
  String s5=new String("pavani");
  System.out.println(s1.equals(s2));//false
  System.out.println(s1.equals(s3));//false
  System.out.println(s1.equals(s4));//true
  System.out.println(s1.equals(s5));//true
  }
  }