import java.awt.*;
import java.awt.event.*;
class MouseDemo extends Frame implements MouseListener
{
 Mouse Demo()
 {
  setSize(400,400);
  setvisible(true);
  setTitle("Example for MouseListener");
  addMouseListener(this);
  }
  public void MouseClicked(MouseEvent m1)
  {
   System.out.println("Mouse clicked");
   }
   public void MouseEntered(MouseEvent m2)
   {
   System.out.println("MouseEntered");
   }
   public void MouseExited(MouseEvent m3)
   {
   System.out.println("MouseExited");
   }
   public void Mousepressed(MouseEvent m4)
   {
    System.out.println("Mousepressed");
    }
    public void MouseReleased(MouseEvent m5)
    {
    System.out.println("MouseReleased");
    }
    public static void main(String args[])
    {
    new MouseDemo();
   }
  }