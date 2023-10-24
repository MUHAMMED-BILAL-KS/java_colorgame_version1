import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SizeAction;

public class ColorGame implements ActionListener {
	JFrame Frame;
	JButton red,green,blue,orange,yellow,gray,cyan,magenta,darkGray;
	JLabel label,label2,label3;
	int a=0;
	String s1,s2,s3,s4,s5,s6,s7,s8;
	ColorGame(){
		Frame=new JFrame();
		Frame.setSize(600, 400);
		Frame.setLayout(null);
		Frame.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
		Frame.setVisible(true);
		
		red=new JButton("");
		red .setBounds(100, 250, 30, 30);
		red.setBackground(Color.red);
		Frame.add(red);
		red.addActionListener(this);
		
		green=new JButton("");
		green.setBounds(200, 250, 30, 30);
		green.setBackground(Color.green);
		Frame.add(green);
		green.addActionListener(this);
		
		blue=new JButton("");
		blue.setBounds(300, 250, 30, 30);
		blue.setBackground(Color.blue);
		Frame.add(blue);
		blue.addActionListener(this);
		
		orange=new JButton("");
		orange .setBounds(100, 210, 30, 30);
		orange.setBackground(Color.orange);
		Frame.add(orange);
		orange.addActionListener(this);
		
		yellow=new JButton("");
		yellow .setBounds(200, 210, 30, 30);
		yellow.setBackground(Color.YELLOW);
		Frame.add(yellow);
		yellow.addActionListener(this);
		
		gray=new JButton("");
		gray .setBounds(300, 210, 30, 30);
		gray.setBackground(Color.gray);
		Frame.add(gray);
		gray.addActionListener(this);
		
		cyan=new JButton("");
		cyan .setBounds(100, 170, 30, 30);
		cyan.setBackground(Color.cyan);
		Frame.add(cyan);
		cyan.addActionListener(this);
		
		magenta=new JButton("");
		magenta .setBounds(200, 170, 30, 30);
		magenta.setBackground(Color.magenta);
		Frame.add(magenta);
		magenta.addActionListener(this);
		
		darkGray=new JButton("");
		darkGray .setBounds(300, 170, 30, 30);
		darkGray.setBackground(Color.darkGray);
		Frame.add(darkGray);
		darkGray.addActionListener(this);
		
		
		label=new JLabel();
		label.setBounds(50, 50, 300, 50);
		label.setHorizontalAlignment(SwingConstants.CENTER);;
		label.setOpaque(true);
		label.setBackground(Color.black);
		label.setForeground(Color.white);
		Frame.add(label);
		
		label2=new JLabel("Tap the red");
		label2.setBounds(50, 300, 300, 50);
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setOpaque(true);
		label2.setBackground(Color.black);
		label2.setForeground(Color.white);
		Frame.add(label2);
		
		label3=new JLabel("");
		label3.setBounds(350, 120, 100, 50);
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setOpaque(true);
		label3.setBackground(Color.black);
		label3.setForeground(Color.white);
		Frame.add(label3);
		
		s1="Tap the red";
		s2="Tap the green";
		s3="Tap the blue";
		s4="Tap the orange";
		s5="Tap the yellow";
		s6="Tap the gray";
		s7="Tap the cyan";
		s8="Tap the magenta";
		
	}
	
	
	public static void main(String[] args) {
		new ColorGame();
	}
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==red)
		{
			Frame.getContentPane().setBackground(Color.red);
			label.setText("RED");
			a=1;
		}
		else if(e.getSource()==green)
		{
			Frame.getContentPane().setBackground(Color.green);
			label.setText("GREEN");
			a=2;
		}
		else if(e.getSource()==blue)
		{
			Frame.getContentPane().setBackground(Color.blue);
			label.setText("BLUE");
			a=3;
		}
		else if(e.getSource()==orange)
		{
			Frame.getContentPane().setBackground(Color.orange);
			label.setText("ORANGE");
			a=4;
		}
		else if(e.getSource()==yellow)
		{
			Frame.getContentPane().setBackground(Color.yellow);
			label.setText("YELLOW");
			a=5;
		}
		else if(e.getSource()==gray)
		{
			Frame.getContentPane().setBackground(Color.gray);
			label.setText("GRAY");
			a=6;
		}
		else if(e.getSource()==cyan)
		{
			Frame.getContentPane().setBackground(Color.cyan);
			label.setText("CYAN");
			a=7;
		}
		else if(e.getSource()==magenta)
		{
			Frame.getContentPane().setBackground(Color.magenta);
			label.setText("MAGENTA");
			a=8;
		}
		else if(e.getSource()==darkGray)
		{
			Frame.getContentPane().setBackground(Color.darkGray);
			label.setText("DARK_GRAY");
			a=9;
		}
		if(a==1) {
			if(label2.getText()==s1) {
				label3.setText("You Win");
				label2.setText(s2);
				}
				else
				{
					label3.setText("LOST ! Try Again");
				}
		}
		else if(a==2) {
			if(label2.getText()==s2) {
				label3.setText("You Win");
				label2.setText(s3);
				}
				else
				{
					label3.setText("LOST ! Try Again");
				}
		}
		else if(a==3) {
			if(label2.getText()==s3) {
				label3.setText("You Win");
				label2.setText(s4);
				}
				else
				{
					label3.setText("LOST ! Try Again");
				}
		}
		else if(a==4) {
			if(label2.getText()==s4) {
				label3.setText("You Win");
				label2.setText(s5);
				}
				else
				{
					label3.setText("LOST ! Try Again");
				}
		}
		else if(a==5) {
			if(label2.getText()==s5) {
			label3.setText("You Win");
			label2.setText(s6);
			}
			else
			{
				label3.setText("LOST ! Try Again");
			}
		}
		else if(a==6) {
			if(label2.getText()==s6) {
				label3.setText("You Win");
				label2.setText(s7);
				}
				else
				{
					label3.setText("LOST ! Try Again");
				}
		}
		else if(a==7) {
			if(label2.getText()==s7) {
				label3.setText("You Win");
				label2.setText(s8);
				}
				else
				{
					label3.setText("LOST ! Try Again");
				}
		}
		else if(a==8) {
			if(label2.getText()==s8) {
				label3.setText("You Win");
				label2.setText(s1);
				}
				else
				{
					label3.setText("LOST ! Try Again");
				}
		}
	}

}
