//java program to display numbers
//from 1 to N using for loop and
//sum of first N  natural number
 import java.io.*;
 //Driver class
 class Natural{
  public static void main(String args[])
  {
   int N=10;
   int sum=0;
  System.out.println("Finding sum of"+ N +" number using for loop");
  //we initilize the value of the variable i
  // with 1 and increment each time with 1
  for (int i = 1; i <= N; i++){
    sum+=i;
   }
   System.out.println("sum of first"+N+" Natural Number="+sum);
   }
  }  