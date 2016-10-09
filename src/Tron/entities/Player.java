package Tron.entities;

import java.awt.Color;

import javax.swing.JLabel;

public class Player extends JLabel{
	public Color ownColor=Color.BLACK;
	public boolean alive=true;
	public void setUp(Color color){
		this.setText(" ");
		this.setSize(10, 10);
		this.ownColor=color;
		this.setOpaque(true);
		this.setBackground(color);
	}
	

}
