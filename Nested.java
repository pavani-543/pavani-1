class Nested
{
 public static void main (String args[])
 {
  Double n1=-1.0,n2=4.5,n3=-5.3,large;
  if(n1>n2)
  {
   if (n1>n3)
  {
   large=n1;
   }
   else
   {
    large=n3;
   }
  }
   else
  {
   if (n2>n3)
{
    large=n2;
   }
else
{
  large=n3;
   }
}
  System.out.println("large number is:"+ large);
  }
 }