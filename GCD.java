public class GCD
 {
//Recursive function to return gcd of a and b
 static  int gcd(int a,int b){
 //Everything divides 0
  if (a==0)
     return b;
  if (b==0)
     return a;
    //Base case
    if(a==b)
     return a;
  //a is greater
   if (a>b){
      if(a%b==0)
        return b;
       return gcd(a-b,b);
   }
    if (b%a==0)
     return a;
     return gcd(a,b-a);
   }
   //Driver code
  public static void main(String args[]){
    int a=98,b=56;
    System.out.println("GCD of"+ a+"and"+b+"is"+gcd(a,b));
    }
   }