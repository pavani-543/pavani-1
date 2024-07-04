import java.io.*;
import java.awt.*;
import java.awt.event.*;
class window extends frame
{
 public static void main(String args[])
{
 Frame f=new frame("Demo");
 f.setsize(500,500);
 f.setvisible(true);
 label l=new label("welcome to india");
 panel p=new panel();
 p.add(1);
 Button b=new Button("click");
 p.add(b);
 f.add(p);
 f.addwindowListener(new WindowAdapter()
 {
  public void window closing(windowEvent we)
  {
   System.exist(0);
   }
   });
   }
  }