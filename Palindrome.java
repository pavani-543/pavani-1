class Palex
{
 public static void main(String args[])
 { 
  int num=121,rev=0,rem,temp;
  temp=num;
  while(num!=0)
  {
   rem=num%10;
   rev=rev*10+rem;
   num=num/10;
   }
   if(temp==rev)
   {
   System.out.println(temp+"is palindrome");
   }
   else
   {
    System.out.println("temp+"is not palindrome");
    }
   }
}