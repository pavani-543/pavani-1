import java.util.Scanner;
class Scan
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.print("enter id,gen,name,salary:");
 int id = sc.nextInt();
 char gen=sc.next().charAt(0);
 String name=sc.next();
 float sal=sc.nextFloat();
 System.out.println("emp id:"+id);
 System.out.println("emp gender:"+gen);
 System.out.println("emp name:"+name);
 System.out.println("emp salary:"+sal);
 }
 }