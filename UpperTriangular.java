public class UpperTriangular
{
 public static void main(String []args)
  {
   int rows,cols;
   //initilize matirx a
   int a[][]={
              {1,2,3},
              {8,6,4},
              {4,5,6}
               };
 //calculates number of rows and columns present in
  rows=a.length;
  cols=a[0].length;

  if(rows !=cols){
  System.out.println("Matrix should be a square matrix");
  }
  else{
  //performs required operation to convert given matrix
  System.out.println("Upper triangular matrix:");
  for(int i=0;i<rows;i++){
  for(int j=0;j<cols;j++){
  if(i>j)
  System.out.print("0");
  else
  System.out.print(a[i][j]+" ");
  }
  System.out.println();
    }
   }
  }
 }