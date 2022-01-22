package com.enterprise;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginPage extends JPanel implements ActionListener{
	
	JTextField namefield,passfield;
	JLabel name,pass;
	JButton loginbutton;
	CenterPanel cp;
	

	public LoginPage() {
		setLayout(new FlowLayout());
		
		name = new JLabel("Name:");
		pass = new JLabel("Password");
		
		namefield = new JTextField(16);
		passfield = new JTextField(16);
		
		add(name);
		add(namefield);
		
		add(pass);
		add(passfield);
		
		
		loginbutton = new JButton("Login");
		add(loginbutton);
		
		loginbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String nametext = namefield.getText();
				String passtext = passfield.getText();
				
				if(nametext.equals(Constants.USERNAME) && passtext.equals(Constants.PASSWORD)) {
					cp.change(Constants.HOMECOMMAND);
					
				}
			}
		});
		
	}
	
	public void setDeck(CenterPanel cp) {
		this.cp = cp;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String actioncommand = e.getActionCommand();
		if(actioncommand.equals(Constants.HOMECOMMAND)) {
			cp.cl.previous(cp);
		}
	}
}
