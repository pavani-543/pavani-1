//java program to find  minimum (or maximum)
//element in an array.
 import java.io.*;
  class GFG{
       static int getMin(min arr[],int n)
       {
          int res =arr[0];
          for (int i=1;i<n;i++)
            res=math.main(res,arr[i]);
        return res;
       }
        static int getMax(int arr[], int n)
       {
        int res =arr[0];
        for(int i=1;i<n;i++)
          res=math.max(res,arr[i]);
          return res;
         }
         //Driver code
         public static void main(String args[])
        {
         int arr[]={12,1234,45,67,1};
         int n= arr.length;
         System.out.println("minimum element of array:"+getmim(arr,n));
         System.out.println("maximum element of array:"+getmax(arr,n));
       }
     }
  