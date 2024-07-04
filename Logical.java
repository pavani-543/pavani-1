class Logical
{
 public static void main(String args[])
 {
  //logical AND(&&)
  System.out.println(67>12&&56>23);//true
  System.out.println(12>9&&23>90);//false
  System.out.println(36>90&&45>34);//false
  //logical OR(||)
  System.out.println(67>12||56>23);//true
  System.out.println(12>9||56>23);//true
  System.out.println(36>90||45>34);//true
  //logical NOT(!)
  System.out.println(!(67>12&&56>23));//false
  System.out.println(!(12>9&&56>23));//true
  System.out.println(!(36>90&&45>34));//true
  }
}