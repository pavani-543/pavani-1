import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class MapEx
{
 public Static void main(String args[])
{
 HashMap<Integor,String>map=new HashMap<Ineger,String>();
 map.put(2,"pavani");
 map.put(22,"manasa");
 map.put(25,"suman");
System.out.println(map.size());
Iterator itr=map.entrySet().iterator();
System.out.println("while loop");
while(itr.hasNext())
{
 Map.Entry me=(Map.Entry)itr.next();
 System.out.println("key is:"+me.getKey()+"\tvalue is:"+me.getValue());
 }
}
}