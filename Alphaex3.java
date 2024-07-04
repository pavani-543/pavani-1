class Alphaex3
{ 
 public static void main(String args[])
 {
  int row=4,val=65;
   for (int i=0;i<row;i++)
   {
  for (int j=1;j<row-1;j++)
  {
  System.out.print("");
  }
  for (int k=0;k<i;k++)
  {
   System.out.print((char)(val+k));
   }
   System.out.println();
   }
   }
  }
