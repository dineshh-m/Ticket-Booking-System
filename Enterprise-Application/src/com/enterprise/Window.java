package com.enterprise;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame {

	CenterPanel cp;
	LoginPage lp;
	HomePage hp;
	public Window() {
		//setLayout(new FlowLayout());
		setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
		setTitle(Constants.TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		lp = new LoginPage();
		hp = new HomePage();
		cp = new CenterPanel(lp, hp);
		
		add(new TopPanel(), BorderLayout.NORTH);
		add(cp,BorderLayout.CENTER);
		
	}
	
	public void changeCenter() {
		add(new HomePage(),BorderLayout.CENTER);
	}
}
