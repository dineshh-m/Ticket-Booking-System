package com.enterprise;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopPanel extends JPanel{

	JLabel title;
	public TopPanel() {
		this.setSize(new Dimension(Constants.WINDOW_WIDTH,100));
		this.setBackground(Color.gray);
		title = new JLabel(Constants.TITLE);
		title.setFont(new Font("Dialog",Font.PLAIN,40));
		add(title);
		
	}
}
