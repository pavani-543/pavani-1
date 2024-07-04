import java.awt.*;
import java.awt.Event.*;
public class RegistrationForm extends Frame{
//components
 private Label nameLabel,emailLabel,passwordLabel;
 private TextField nameField,emailField;
 private TextField passwordField;
 private Button submitButton;
 //constructior
  public RegistrationForm(){
  //Frame setup
   setTitle("Registration Form");
   setSize(300,200);
   setLayout(new FlowLayout());
   //components initialization
    nameLabel=new Label("Name");
    nameField=new TextField(20);
     emailLabel=new Label("Email:");
    emailField=new TextField(20);
    passwordLabel=newLabel("password");
    passwordField=newtextField(20);
    passwordField.setEchochar('*');
    submitButton=new Buton("submit");
   //Add cpmponents to frame
   add(nameLabel);
   add(nameField);
   add(emailLabel);
   add(emailField);
   add(passwordLabel);
   add(passwordField);
   add(submitButton);
   //Event handling
   submitButton.addActionListener(new ActionListener(){
   public void actionperformed(ActionEvent e){
   //perform registration logic here
    String name=nameField.getText();
    String email=emailField.getText();
    String password=passwordField.getText();
    //example:print thr registration info
     System.out.println("Name:"+name);
     System.out.println("Email:"+email);
     System.out.println("password:"+password);
     }
    });
   //Display frame
    SetVisible(true);
   //close operation
    addWindowListener(new windowAdapter())
    {
     public void windowClosing(windowEvent e){
     display();
     }
    });
    }
     public Static void main(String args[]){
       new Registration Form();
     }
    }
    
   
