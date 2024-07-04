import java.lang.*;
class Builder
{
 public static void main(String args[])
 {
  StringBuilder sb=new StringBuilder("hello");
  sb.append("world");
  System.out.println("after appending a String:"+sb);//helloworld
  sb.insert(2,"java");
  System.out.println("after inserting a String:"+sb);//hejavalloworld
  sb.delete(1,3);
  System.out.println("after deleting a String:"+sb);//havpavworld
  sb.reverse();
  System.out.println("after reversing a String:"+sb);//dlrow vaphav
  }
  }