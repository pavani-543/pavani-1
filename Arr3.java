class Arr3
{
 public static void main(String args[])
 {
  String comp[][]=new String[3][];
  comp[0]=new String[]{"intel","AMD"};
  comp[1]=new String[]{"IBM","MICRISOFT","son"};
  comp[2]=new String[]{"hp","dell","acser","epson"};
  for(int row=0;row<comp.length;row++)
  {
   System.out.print("list of companies in group"+(row+1)+":1+");
   for(int col=0;col<comp[row].length;col++)
   {
    System.out.print(comp[row][col]+"");
    }
     System.out.println();
     }
    }
   }