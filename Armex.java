class Armex
{
 public static void main(String args[])
 {
 int no=155,temp,rem,result=0;
 temp=no;
 while(temp!=0)
 {
  rem=temp%10;
  result=result+rem*rem*rem;
  temp=temp/10;
  }
  if (result==no)
  {
  System.out.println(no+"is an armstrong number");
  }
  else
  {
    System.out.println(no+"is an armstrong number");
    }
    
   }
 }
