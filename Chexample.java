import java.awt.*;
class Chexample extends Frame
{
 Chexample()
 {
  setLayout(new FlowLayout());
  Label l=new Label("hobbies");
  Checkbox s=new Checkbox("supports");
  Checkbox m=new Checkbox("music",true);
  Checkbox r=new Checkbox("reading");
  Checkbox t=new Checkbox("travelling");
  add(s);
  add(m);
  add(r);
  add(t);
  }
 }
  class Checkboxex
 {
 public static void main(String args[])
 {
  Chexample ch=new Chexample();
  ch.setTitle("check box example");
  ch.setSize(400,550);
  ch.setVisible(true);
   }
  }  