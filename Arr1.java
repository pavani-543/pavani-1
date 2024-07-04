class Arr1
{
 public static void main(String args[])
 {
  int dimension[][]=new int[4][5];
  int numone=0;
  for(int row=0;row<4;row++)
  {
   for(int col=0;col<5;col++)
   {
    dimension[row][col]=numone;
    numone++;
    }
    for (int row=0;row<4;row++)
    {
     System.out.print(dimension[row][col]+"\t");
     }
     System.out.print();
     }
    }
   }