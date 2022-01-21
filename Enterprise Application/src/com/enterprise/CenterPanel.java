package com.enterprise;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CenterPanel extends JPanel{
	
	CardLayout cl ;
	
	
	//JPanel login,home;
	public CenterPanel(LoginPage login,HomePage home) {
		cl = new CardLayout();
		setLayout(cl);
		login.setDeck(this);
		home.setDeck(this);
		add(login, "Login");
		add(home, "Home");
		
		
	}
	
	public void change(String command) {
		if(command.equals(Constants.HOMECOMMAND)) {
			cl.show(this, "Home");
		}
	}
}
