package com.enterprise;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class BookedTickets extends JPanel{

	JTable tickettable;
	JScrollPane jsp;
	JButton back;
	HomePage hp;
	
	
	public BookedTickets() {
		tickettable = new JTable(Constants.data, Constants.colHead);
		tickettable.setEnabled(false);
		jsp = new JScrollPane(tickettable);
		back = new JButton("Back");
		
		
		back.setBackground(Color.red);
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				hp.cl.show(hp, "menu");
			}
		});
		
		add(jsp);
		add(back);
	}
	
	public void setDeck(HomePage hp) {
		this.hp = hp;
	}
}
