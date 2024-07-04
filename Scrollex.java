import java.awt.*;
class Scrollex extends Frame
{
 Scrollex()
{
 setLayout(new FlowLayout());
 Label l1=new Label("Horizontal Scrollbar");
 Scrollbar s1=new Scrollbar(Scrollbar.HORIZONTAL,50,10,0,100);
 Label l2=new Label("vertical Scrollbar");
 Scrollbar s2=new Scrollbar(Scrollbar.VERTICAL,10,5,0,10);
 add(l1);
 add(s1);
 add(l2);
 add(s2);
 }
 }
 class Scbarex
 {
  public static void main(String args[])
  {
   Scrollex s=new Scrollex();
   s.setTitle("Scrollbar example");
   s.setSize(500,500);
   s.setVisible(true);
   }
  }