class StringEx
{
 public static void main(String args[])
 {
  String t="welcome";
  String t1="INDIA";
  System.out.println("length is:"+t.length());
  System.out.println("character position:"+t.charAt(3));
  System.out.println("index of character:"+t.indexOf('0'));
  t=t.concat("to java class");
  System.out.println("concatenation:"+t);
  String p[]=t.split("");
  System.out.println("after spliting:"+p[0]+":"+p[1]);
  System.out.println("substing:"+t.substring(0,5));
  System.out.println("coverting to upper case:"+t.toUpperCase());
  System.out.println("converting to lower case:"+t1.toLowerCase());
  }
 }