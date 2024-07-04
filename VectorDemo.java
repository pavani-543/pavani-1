import java.util.*;
class VectorDemo
{
 public static void main(String args[])
 {
  Vector<Integer>V=new Vector<Integer>();
  int x[]={34,45,55,66,77,88};
  for(int i=0;i<x.length;i++)
  V.add(x[i]);
  for(int i=0;i<V.size();i++)
  System.out.println(V.get(i));
  ListIterator lit=V.listIterator();
  System.out.println("in forward direction");
  while(lit.hasNext())
  System.out.println(lit.next()+" ");
  System.out.println("in reverse direction");
  while(lit.hasPrevious())
  System.out.println(lit.previous()+" ");
  }
  }