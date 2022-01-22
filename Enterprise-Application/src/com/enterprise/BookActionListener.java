package com.enterprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookActionListener implements ActionListener {
	
	BookTickets bt;
	String name;
	int seatno = 1;
	int age;
	int count;
	boolean isAirConditioned = false;
	boolean isSleeper = false;
	boolean isPantry = false;
	String depature,arrival;
	String sex;
	
	public BookActionListener(BookTickets bt) {
		this.bt = bt;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Constants.countvar++;
		name = bt.namefield.getText();
		String temp = bt.agefield.getText();
		count = Integer.parseInt(temp);
		isAirConditioned = bt.ac.isSelected();
		isSleeper = bt.sleeper.isSelected();
		isPantry = bt.pantry.isSelected();
		temp = bt.agefield.getText();
		age = Integer.parseInt(temp);
		depature = (String) bt.fromfield.getSelectedItem();
		arrival = (String) bt.tofield.getSelectedItem();
		sex = (String) bt.sexfield.getSelectedItem();
		loadTable();
	}
	
	private void loadTable() {
		Constants.data[Constants.countvar][0] = name;
		Constants.data[Constants.countvar][1] = seatno;
		Constants.data[Constants.countvar][2] = depature;
		Constants.data[Constants.countvar][3] = arrival;
		Constants.data[Constants.countvar][4] = age;
		Constants.data[Constants.countvar][5] = sex;
	}

}
