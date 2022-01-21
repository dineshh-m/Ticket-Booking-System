package com.enterprise;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BookTickets extends JPanel implements ActionListener{

	//String name;
	int count;
	int amount;
	JLabel namelabel,countlabel,travelclasslabel,fromlabel,tolabel,agelabel,sexlabel;
	JTextField namefield,countfield,agefield;
	JComboBox<Integer> jcb,travelclass;
	JComboBox<String> fromfield,tofield,sexfield;
	JButton back,book;
	HomePage hp;
	JCheckBox ac,sleeper,pantry;
	ArrayList<String> districtList;
	
	public BookTickets() {
		setLayout(new FlowLayout());
		namelabel = new JLabel("Name:");
		countlabel = new JLabel("Count:");
		travelclasslabel = new JLabel("Class");
		sexlabel = new JLabel("Sex");
		agelabel = new JLabel("Age");
		travelclass = new JComboBox<Integer>();
		back = new JButton("Back");
		ac = new JCheckBox("Air Conditioned");
		sleeper = new JCheckBox("Sleeper");
		pantry = new JCheckBox("Pantry Service");
		book = new JButton("Book");
		fromlabel = new JLabel("From:");
		tolabel = new JLabel("To:");
		fromfield = new JComboBox<>();
		tofield = new JComboBox<>();
		sexfield = new JComboBox<>();
		
		sexfield.addItem("Male");
		sexfield.addItem("Female");
		sexfield.addItem("Custom");
		
		districtList = new ArrayList<>();
		districtList.add("Chennai Egmore");
		districtList.add("Madurai JN");
		districtList.add("Thiruchirapalli JN");
		districtList.add("Washington D.C");
		districtList.add("Bangalore");
		districtList.add("Delhi");
		districtList.add("San Fransisco");
		districtList.add("Chicago");
		districtList.add("Singapore");
		districtList.add("New York");
		districtList.add("Los Angeles");
		
		for(String s : districtList) {
			fromfield.addItem(s);
			tofield.addItem(s);
		}
		
		book.setBackground(Color.green);
		book.addActionListener(new BookActionListener(this));
		back.setBackground(Color.red);
		back.addActionListener(this);
		
		jcb = new JComboBox<>();
		jcb.addItem(1);
		jcb.addItem(2);
		jcb.addItem(3);
		jcb.addItem(4);
		jcb.addItem(5);
		
		namefield = new JTextField(15);
		agefield = new JTextField(2);
		
		travelclass.addItem(1);
		travelclass.addItem(2);
		travelclass.addItem(3);
		
		add(namelabel);
		add(namefield);
		
		add(agelabel);
		add(agefield);
		
		add(sexlabel);
		add(sexfield);
		
		add(countlabel);
		add(jcb);
		add(travelclasslabel);
		add(travelclass);
		
		add(ac);
		add(sleeper);
		add(pantry);
		
		add(fromlabel);
		add(fromfield);
		
		add(tolabel);
		add(tofield);
		
		add(book);
		add(back);
		
	}
	
	public void setDeck(HomePage hp) {
		this.hp = hp;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String actioncommand = e.getActionCommand();
		if(actioncommand.equals("Back")) {
			hp.cl.show(hp, "menu");
		}
	}
}
