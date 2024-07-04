//java program to find if X is a perfect square
class Square{
 static boolean isPerfectSquare(int x)
{
   if(x>=0){
 //Find floting point value of square root of x
   int sr=(int)Math.sqrt(x);
//if product of square root is equal,then returnT/F
 return((sr*sr==x));
 }
   return false;
 }
 //Driver code
 public static void main(String args[])
 {
   int x=2502;
   if(isPerfectSquare(x))
    System.out.print("yes");
   else
    System.out.print("No");
   }
  } 