class Matrix
{
 public ststic void main(String args[])
 {
  int rows=2,cols=3;
  int[][]fm={{12,13,14}},{15,16,17}};
  int[][]sm={{21,22,23}},{31,32,33}};
  //adding two matrices
  int[][] sum=new int[rows][cols];
  for(int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
       sum[i][j]=fm[i][j]+sm [i][j];
     }
    }
    //dispaly the result
    System.out.println("sum of two matrics:");
    for(int []row:sum)
    {
     for(int column:row)
     {
      System.out.print(colum+"");
      }
       System.out.println();
      }
     }
     }