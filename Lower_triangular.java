public class LowerTriangular
{
 public static void main(String args[]){
  int row,cols;
  //Intilize matrix a
   int a[][]={
              {1,2,3},
              {8,6,4},
              {4,5,6}
              };
//calculate number of rows and columns present in given matrix
 rows=a.length;
  cols=a[0].length;
  if(rows !=cols){
   Systm.out.println("Lower triangular matrix:");
   for(int i=0; i<rows;i++){
   for(int j=0;j<cols;j++){
   if(j>i)
   System.out.print("0");
   else
   System.out.print(a[i][j]+"");
  }
 System.out.println();
 }
}
}
}