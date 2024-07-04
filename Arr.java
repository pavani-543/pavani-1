import java.io.*;
class Arr
{
 public  static void main(String args[])throws IoException
 {
  BufferedReader br=new BufferedReader(new IputStreamReader(System.in));
  int marks[]=new int[5];
  for(int i=0;i<5;i++)
  {
   System.out.println("enter marks:");
   marks[i]=Integer;parse Int(br.readLine());
   }
    int tot=0;
    for(int i=0;i<5;i++)
    {
     System.out.println(marks[i]);
     tot=tot+marks[i];
     }
     System.out.println("total marks="+tot);
      float percent=(float)tot/5;
      System.out.println("percent="+percent);
     }
     }