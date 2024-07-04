import java.util.Arrays;
class array11
{
 public static void main(String args[])
 {
  int ar[]={67,34,12,2,89,1,23,7,13};
  Arrays.sort(ar,0,4);
  System.out.println("sorted array in range id:\n"+Arrays.toString(ar));
  Arrays.sort(ar);
  System.out.println("complete sorted array:\n"+Arrays.toString(ar));
  int index=Arrays.binarySearch(ar,23);
  System.out.println("position index value is:\n"+index);
  int[] rcopy=Arrays.copyOfRange(ar,1,5);
  System.out.println("copied sub array:\n"+Arrays.toString(rcopy));
  Arrays.fill(ar,10);
  System.out.println("Array copeletely filled:\n"+Arrays.toString(ar));
  }
 }