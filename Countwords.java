import java.util.Hashmap2;
public class CountWords
{
 public static void main(String args[])
 String[]split str="today we discussing collections concepts";
 String[]split=str.split("");
 HashMap<String,Integer>map=new HashMap<string,Integer>();
 for(int i=0;i<split.length,i++)
 {
 if(map.containsKey(split[i]))
 {
  int count=map.get(Split[i]);
  {
  int count=map.get(Split[i]);
  map.put(Spilt[i],count +1);
  }
  else
 {
  map.put(Split[i],1);
  }
  }
  System.out.println(map);
  }
 }