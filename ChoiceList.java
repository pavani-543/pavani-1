//List box example
import java.awt.*;
import java.awt.event.*;
class ChoiceList implements ItemListener
{
 Choice ch;
 Textfield tf;
 public ChoiceList()
 {
  Panel p=new Panel();
  p.setLayout(new FlowLayout());
  Frame f=new Frame("Choice");
  ch=new Choice();
  ch.addItem("green");
  ch.addItem("red");
  ch.addItem("pink");
  p.add(ch);
  tf=new TextField(20);
  p.add(tf);
  f.add(p);
   f.setSize(300,300);
   f.setVisible(true);
   ch.addItemListener(this);
   }
   public void itemstatechanged(ItemEvent ie)
   {
    if(ie.getItem().equals("green"))
    tf.setBackground(color.green);
    if(ie.getItem().equals("red"))
    tf.setBackground(color.red);
    if(ie.getItem().equals("pink"))
    tf.setBackground(color.pink);
    }
    public static void main(String args[])
    {
     ChoiceList c=new ChoiceList();
     }
    }