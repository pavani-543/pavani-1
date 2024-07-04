// Java program to move all Zeros to the end
 import java.util.*;
 public class arrzero{
  public static void main(String args[]){
    int[] A={5,6,0,4,6,0,9,0,8};
    int n=A.length;
    int j=0;
    for (int i=0;i<n;i++){
      if (A[i] !=0){
      //swap -A[j],A[i]
    swap (A,j,i);//partitioning the array
    j++;
    }
   }
   for (int i=0;i<n;i++){  
    System.out.print(A[i] +" ");//print the array
    }
   }
   //utility function to swap two elementsof an array
    public static void swap(int[] A, int a,int b)
    { 
      int temp=A[a];
       A[a]=A[b];
       A[b]=temp;
     }
    }
