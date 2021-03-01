import java.awt.*;  
import java.awt.event.*;
 public class robot extends Frame
 {
robot()
	{
		//for closing
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g)
	{
		//border
	
		g.fillRect(40,40,200,200);
		//face
		g.setColor(Color.gray);
		g.fillOval(90,70,80,80);
		//neck
		g.setColor(Color.blue);
		g.fillRect(130,135,17,15);
		//eye
		g.setColor(Color.black);
		g.fillOval(110,95,5,5);
		g.fillOval(145,95,5,5);
		//nose
		g.setColor(Color.red);
		g.fillOval(130,112,5,5);
		//arc
		g.setColor(Color.black);
		g.drawArc(113,115,35,20,0,-180);
		g.drawArc(113,115,40,20,0,-190);
	}

	public static void main(String[] args)
	{
		robot e=new robot();
		e.setTitle("robot");
		e.setSize(600,600);
		e.setVisible(true);
		}
 }