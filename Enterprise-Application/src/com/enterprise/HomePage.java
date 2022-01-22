package com.enterprise;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class HomePage extends JPanel implements ActionListener{

	JButton book,available,booked,back;
	CenterPanel cp;
	JPanel menu;
	CardLayout cl;
	BookTickets bt;
	BookedTickets bts;
	
	public HomePage() {
		cl = new CardLayout();
		menu = new JPanel();
		bt = new BookTickets();
		bts = new BookedTickets();
		bts.setDeck(this);
		bt.setDeck(this);
		menu.setLayout(new FlowLayout());
		setLayout(cl);
		setBackground(Color.yellow);
		book = new JButton("Book Tickets");
		available = new JButton("Check seats Availability");
		booked = new JButton("See Booked seats");
		back = new JButton("Back");
		back.setBackground(Color.red);
		menu.add(book);
		menu.add(available);
		menu.add(booked);
		menu.add(back);
		add(menu,"menu");
		add(bt,"Book Tickets");
		add(bts,"Booked Tickets");
		book.addActionListener(this);
		back.addActionListener(this);
		booked.addActionListener(this);
	}
	
	public void setDeck(CenterPanel cp) {
		this.cp = cp;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String actioncommand = e.getActionCommand();
		if(actioncommand.equals("Book Tickets")) {
			cl.show(this, "Book Tickets");
		}else if(actioncommand.equals("Back")) {
			cp.cl.show(cp,"Login");
		}else if(actioncommand.equals("See Booked seats")) {
			cl.show(this, "Booked Tickets");
		}
	}
}
