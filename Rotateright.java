class Rotateright{
 public static void main(String args[]){
 //initialize array
 int[] arr= new int[]{1,2,3,4,5};
  int n=3;
  //display original array
  System.out.println("Original array:");
  for(int i=0;i<arr.length;i++){
  System.out.print(arr[i]+"");
  }
  //rotate the given array by n times toward right
   for(int i=0;i<n;i++){
    int j,last;
    //stores the last element of array
     last=arr[arr.length-1];
      
     for(j=arr.length-1;j>0;j--){
      //shift element of array by one
        arr[j]=arr[j-1];
     }
     //last element of array will be added to the start of array
      arr[0]=last;
      }
      //display resulting array after rotation
      System.out.println("Array after right rotation:");
       for(int i=0;i<arr.length;i++){
       System.out.print(arr[i]+"");
      }
     }
    }  