//java program to swap two variables
//Driver class
public class Swap
 {
  public static void main(String args[])
  {
   int x=100,y=300;
   System.out.println("Before Swap");
   System.out.println("x="+ x);
   System.out.println("y="+y);
   //swaping using three variables
     int temp=x;
     x=y;
     y=temp;
    System.out.println("After swap");
    System.out.println("x="+ x);
    System.out.println("y="+ y);
   }
  }