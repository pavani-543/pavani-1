//Radio buttons
import java.awt.*;
import java.awt.event.*;
class ChBoxGroup extends Frame implements ItemListener
{
 Panel pan1,pan2;
 TextField tf;
 check chBoxGroup()
 {
  setLayout(new GridLayout(2,1));
  cbg=new checkboxGroup();
  pan1=new Panel();
  tf=new TextField("changeFont",20);
  pan1.add(tf);
  pan2=new panel();
  cbold=new checkbox("Bold",false,cbg);
  cplain=new checkbox("plain",false,cbg);
  citalic=new checkbox("Italic",false,cbg);
  pan2.setBackground(color.magenta);
  pan2.add(cbold);
  pan2.add(citalic);
  pan2.add(cplain);
  add(pan2);
  Cbold.addItemListener(this);
  Citalic.addItemListener(this);
  Cplain.addItemListener(this);
  }
   public void itemState Changed(ItemEvent ie)
  {
   Font f;
   if(ie.getItem().equals("Bold")&&cbold.getstate())
   {
    f=new Font("serif",Font.BolD,15);
    tf.setFont(f);
    }
    else if(ie.getItem().equals("Italic")&&citalic.getstate())
    {
     f=new Fant("Arial",Font.ITALIC,20);
     tf.setFont(f);
     }
     elseif(ie.getItem().equals("plain")&&cplain.getstate())
     {
     f=new Font("Helivetica",Font.PLAIN,16);
     tf.setFont(f);
     }
    }
    public static void main(String args[])
   {
    ChBoxGroup cbg=new chBoxGroup();
    cbg.setVisible(true);
    cbg.setSize(300,300);
    }s
   }
   