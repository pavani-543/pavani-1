import java.io.*;
import java.awt.*;
import java.awt.event.*;
class Window extends Frame
{
 public static void main(String args[])
{
 Frame f=new Frame("Demo");
 f.setSize(500,500);
 f.setVisible(true);
 Label l=new Label("welcome to india");
 Panel p=new Panel();
 p.add(l);
 Button b=new Button("click");
 p.add(b);
 f.add(p);
 f.addWindowListener(new WindowAdapter()
 {
  public void windowClosing(WindowEvent we)
  {
   System.exit(0);
   }
   });
   }
  }