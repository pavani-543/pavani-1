//menu bar
import java.awt.*;
import java.awt.Event.*;
class ChActionItem extends Frame implements ActionListener
{
 menuBar bar;
 menu courses;
 menuItem BA,BSC,BCOM;
 checkboxmenuItem vacant;
 menu Shortcut shortcut;
 String mesg="";
 TextField tf=new TextField(20);
 chActionItem()
 {
  tf.setBackground(color.red);
  add(tf,"North");
  Shortcut=menu menuShortcut('9',true);
  bar=new menuBar();
  courses= new menu("course");
  BA=new menuItem("BA");
  BSC=new menuItem("BSC");
  BCOM=new menuItem("BCOM");
  vacant=new checkboxmenuItem("seats vacant",true);
  course.add(BA);
  course.add(BSC);
  course.add(BCOM);
  course.add(vacant);
  bar.add(courses);
  setmenuBar(bar);
  BA.addActionListener(this);
  BSC.addActionListener(this);
  BCOM.addActionListener(this);
  }
  public void actionperformed(ActionEvent ae)
  {
   if(ae.getSource()==BA)
   {
   mesg="BA with english and telugu literature;
   repaint();
   }
   if(ae.get source()==BSC)
   {
    mesg="BSC with homeSciences and Biochemistry";
    reopaint();
    }
    if(ae.getsource()==BCOM)
   mesg="BCOM with commerce and computers";
   repaint();
   }
  }
  Font f=new Font("Helivetica",Font.BOLD,20);
  public void paint(Graphics g)
  {
   g.setFont(f);
   g.drawstring(mesg,50,150);
   }
    public static void main(String args[])
   {
    ChActionItem ch=new ChActionItem();
    ch.setSize(500,500);
    ch.setVisible(true);
    }
   }