import java.awt.*;
import java.awt.event.*;
public class calculator extends frame implements ActionListener{
Textfield tf;
Button b[]=new button[16];
string[]buttonTexts={"7","8","9","+","4","5","6","-","1","2","3","*","c","0","=","/"};
String expression="";

calculator(){
       tf=new Textfield();
       tf.setBounds(50,50,250,40);
       add(tf);
     int x=50,y=100,width=50,height=50;
     for(int i=0;i<16;i++){
         x=50;
         y=50;
        }
        else
        {
         x +=50;
       }
       add(b[i]);
      b[i].addActionListener(this);
      }
      setSize(400,400);
      setLayout9null);
      setVisible(true);
      }
     public void Actionperformed(ActionEvent e){
     String command=e.getActionCommand();
     if (command.equals("c")){
     expression="";
     tf.setText("");
     }
      else if(command.equals("="))
      {
       try
       {
        expression=evaluateExpression(expression);
        tf.setText(expression);
        }
        catch(arthamaticException ex){
        tf.setText("Error");
        }
       private double eval(final String str){
        return new object(){
        int pos=-1,ch;
        void nextchar(){
             ch=(++pos<str.length())? str.charAt(pos):-1;
        }
        boolean eat(int charToEat){
        nextChar();
        double x=parseExpression();
        if(pos<str.length()) throw new RuntimeException("unexpected:"+(char)ch);
        return x;
         }
         double parseFactor(){
         if(eat('+'))return parseFactor();
         if(eat('-'))return-parseFactor();
        
         double x;
         int startpos=this.pos;
         if eat('(')){
          x=parseExpression();
           eat(')');
        }
        elseif((ch>='0'&& ch<='9'||ch=='.'){
        while((ch>='0'&& ch<='9'||ch=='.')nextchar();
       }
        else{
           throw new RuntimeException("unexpected:"+(char)ch);
           }
           if(eat('^'))x=math.pow(x,parseFactor());
           return x;
           }
           }.parse();
           public static void main(String args[]){
           new Calculator();
           }
          }
           