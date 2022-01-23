package com.enterprise;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class ProfilePanel extends JPanel implements ActionListener{
	
	JLabel userNameField, passwordField;
	JTextField username,password;
	JButton back, ok;
	HomePage hp;
	

	public ProfilePanel() {
		setLayout(new FlowLayout());
		
		//Label and password Field
		userNameField = new JLabel("Username: ");
		passwordField = new JLabel("Password: ");
		
		username = new JTextField(Constants.USERNAME, 12);
		password = new JTextField(Constants.PASSWORD, 12);
		
		back = new JButton("Back");
		ok = new JButton("Ok");
		
		back.setBackground(Color.red);
		back.addActionListener(this);
		ok.addActionListener(this);
		
		add(userNameField);
		add(username);
		add(passwordField);
		add(password);
		add(ok);
		add(back);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String actioncommand = e.getActionCommand();
		if(actioncommand.equals("Back")) {
			hp.cl.show(hp, "menu");
		}else if(actioncommand.equals("Ok")) {
			Constants.USERNAME = username.getText();
			Constants.PASSWORD = password.getText();
		}
	}
	
	public void setDeck(HomePage hp) {
		this.hp = hp;
	}
}
