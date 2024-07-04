import java.awt.*;
import java.awt.event.*;
public class ChoiceDemo extends Frame
{
 ChoiceDemo()
{
 Frame f=new Frame();
 f.setTitle("choice example");
 f.setSize(300,400);
 f.setVisible(true);
 Panel p=new Panel();
 f.add(p);
 Choice ch=new Choice();
 ch.addItem("india");
 ch.addItem("russia");
 ch.addItem("america");
 ch.addItem("japan");
 p.add(ch);
 }
 public static void main(String args[])
 {
  ChoiceDemo d=new ChoiceDemo();
  }
 }