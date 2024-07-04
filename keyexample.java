import java.awt.*;
import java.awt.event.*;
class Keyexample extends Frame implements KeyListener{
  Label l;
  TextArea area;
  Keyexample()
  {
   l=new Label();
   l.setBounds(20,50,100,20);
   area=new TextArea();
   area.setBounds(20,80,300,300);
   area.addKeyListener(this);
   add(l);
   add(area);
   setSize(500,500);
   setVisible(true);
   }
    public void Keypressed(KeyEvent e)
    {
     l.setText("Key Typed");
     }
     public static void main(String args[])
    {
     new Keyexample();
    }
   }