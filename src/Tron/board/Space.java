package Tron.board;

import java.awt.Color;

import javax.swing.JLabel;

import Tron.entities.Player;

public class Space extends JLabel {
	public Color ownColor=Color.BLACK;
	public void setUp(){
		this.setSize(10,10);
		this.setBackground(Color.BLACK);
		this.setOpaque(true);
	}
	public void colorize(Color color){
		ownColor=color;
		this.setBackground(color);
	}

}
