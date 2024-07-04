import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Readonly
{
 public static void main(String args[])
 {
  List<String> l=new ArrayList<String>();
  l.add("pavani");
  l.add("manasa");
  l.add("srishti");
  l.add("suman");
  l.add("sushma");
  List<String> li=Collections.unmodifiableList(l);
  li.add("india");
  System.out.println(l);
  }
 }
