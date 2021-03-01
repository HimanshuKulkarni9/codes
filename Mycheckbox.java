import java.awt.*;
import java.awt.event.*;
class Mycheckbox extends Frame implements ItemListener
{
 String msg="";
 Checkbox c1,c2,c3;
 Mycheckbox(){
 setLayout(new FlowLayout());
 c1=new Checkbox("Himanshu",true);
 c2=new Checkbox("Kulkarni");
 c3=new Checkbox("svvv");
    add(c1);
    add(c2);
 add(c3);
    c1.addItemListener(this);
    c2.addItemListener(this);
 c3.addItemListener(this);
 //to close window
 addWindowListener(new WindowAdapter()
 {
 public void windowClosing(WindowEvent e){
 System.exit(0);
 }
 });
 }
 //method when user click the checkbox
 public void itemStateChanged(ItemEvent ie){
  repaint();
 }
 public void paint(Graphics g){
 Font f=new Font("Arial",Font.PLAIN,14);
 g.setFont(f);
 g.setColor(Color.black);
 msg="Himanshu:"+c1.getState(); 
 
 msg="Kulkarni:"+c2.getState();
 
    msg="svvv:"+c3.getState();
 
 }
 public static void main(String[] args){
    Mycheckbox cb=new Mycheckbox();
    cb.setTitle("Check Box Status");
    cb.setSize(450,400);
    cb.setVisible(true);
 }
}