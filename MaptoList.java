import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
 public class MaptoList{
 public static void main(String args[]){
 Map<Integer,String>MyMap=new HashMap<>();
 MyMap.put(1,"mango");
 MyMap.put(2,"apples");
 MyMap.put(3,"grapes");
 MyMap.put(4,"kiwi");
 ArrayList<Integer>keyList=new
 ArrayList<Integer>(MyMap.keySet());
   ArrayList<String>valueList=new
 ArrayList<String>(MyMaP.value());
 System.out.println("list holding keys:"+keyList);
 System.out.println("list holding values:"+valueList);
 }
}