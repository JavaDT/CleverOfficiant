package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class Fr extends JFrame {
	JLabel lbl;
	  JButton b;
	   JButton b2;
	   JButton b3;
	    public Fr(){
	        setTitle("CleverOficiant");
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setBounds(335,20, 637, 700);
	       
	        
	        setContentPane(new BgPanel());
	        
	        Container cont = getContentPane();
	        
	        
	       
	       
	        ImageIcon icon = new ImageIcon("D:\\pict\\btbf.png");
	        ImageIcon icon2 = new ImageIcon("D:\\pict\\btbs.png");
	        ImageIcon icon3 = new ImageIcon("D:\\pict\\btbt.png");
	        lbl = new JLabel();
	        lbl.setPreferredSize(new Dimension(445,237));
	        
	        b = new JButton();
	      
	        b.setVerticalTextPosition(AbstractButton.CENTER);
	          b.setHorizontalTextPosition(AbstractButton.LEADING);
	       
	          b.setIcon(icon);
	          b.setPreferredSize(new Dimension(319,89));
	       b.setLocation(400,455);
	          b2 = new JButton();
	         // ActionListener actionListener = new actionListener1();
	         // b.addActionListener(actionListener);
	        b2.setVerticalTextPosition(AbstractButton.CENTER);
	          b2.setHorizontalTextPosition(AbstractButton.LEADING);
	       
	          b2.setIcon(icon2);
	          b2.setPreferredSize(new Dimension(319,89));   
	        b2.setLocation(400,400);

	          ActionListener actionListener2 = new actionListener2();
	          b2.addActionListener(actionListener2);
	          b3 = new JButton();
	        
	        b3.setVerticalTextPosition(AbstractButton.CENTER);
	          b3.setHorizontalTextPosition(AbstractButton.LEADING);
	       
	          b3.setIcon(icon3);
	          b3.setPreferredSize(new Dimension(319,89));
	        //  ActionListener actionListener3 = new actionListener3();
	         // b.addActionListener(actionListener3);
	          cont.add(lbl);
	        cont.add(b);
	        cont.add(b2);
	      cont.add(b3);
	    } 

	
		
	
	
	
	
	
	
}	


class actionListener2 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e3) {
		// TODO Auto-generated method stub
		
	}
		class actionListener1 implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e1) {
				// TODO Auto-generated method stub
				
			}

			class actionListener3 implements ActionListener {

				@Override
				public void actionPerformed(ActionEvent e3) {
					// TODO Auto-generated method stub
					
				}
		}}}
	 
	class BgPanel extends JPanel{
	    public void paintComponent(Graphics g){
	        Image im = null;
	       
	        try {
	            im = ImageIO.read(new File("D:\\pict\\bg3.jpg"));
	        } catch (IOException e) {}
	        g.drawImage(im, 0,0, null); 
	    }}
	

