import java.util.Arrays;
public class BinarySearch{
 public static void main(String[] args){
    //Declaring an ineger array
    int arr[]={10,20,15,22,35};
    //sorting the above array
    Arrays.sort(arr);
    
    int key=22;
    int res=Arrays.binarySearch(arr, key);
     if(res >= 0)
      System.out.println(key+" found at index=" +res);
    else
     System.out.println(key+ "Not found");
     key = 40;
     res = Arrays.binarySearch(arr, key);
     if (res>=0)
       System.out.println(key +" found at index =" +res);
       else
         System.out.println(key + "Not found");
       }
      }

              