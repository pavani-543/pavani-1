import java.io.*;
import java.awt.*;
import java.awt.event.*;
class NewFrame extends Frame
{
 NewFrame()
{
 Label l=new Label("new window");
add(l); 
setSize(300,300);
setvisible(true);
}
}
class LoginEx1 implements ActionListener
{
 TextField t1,t2;
 LoginEx1()
 {
  Freame f=new Frame("login");
  Panel p=new panel();
  FlowLayout f1=new FlowLayout();
  p.setLayout(fl);
  f.setSize(300,300);
  f.setvisible(true);
  class MyAdapter extends WindowAdpter
  {
   public void windowClosing(windowEvent e)
   {
    System.exit(0);
   }
  }
  t1=new TextField(20);
  t2=new TextField(20);
  t2=setEchochar('*');
  Label l1=new Label("user name");
  Label l2=new Label("pass word");
  Button b=new Button("signin");
  p.add(l1);
  p.add(t1);
  p.add(l2);
  p.add(t2);
  p.add(b);
  p.add(p);
  b.addActionListener(this);
  }
  public void actionperformed(ActionEvent ae)
  {
   String t=t1.getText();
   String p=t2.getText();
   if(t.equals("l technologies")&&p.equals("Software")
   {
    NewFrame n=new NewFrame();
    }
   }
   public static void main(String args[])
   {
    LoginEx1 e=new LoginEx1();
    }
   } 