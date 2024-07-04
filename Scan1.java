import java.util.Scanner;
class Scan1
{
 public static void main(String args[])
 {
  Scanner sc= new Scanner(System.in);
  System.out.println("enter id,gen,name,salary:");
  int id= sc.nextInt();
  char gen= sc.next().charAt(0);
  String name=sc.next();
  float sal=sc.nextFloat();
  System.out.printf("id=%d %n gen=%c %n name=%s %n salary=%f,"+id,gen,name,sal);
  }
  }