package Tron.board;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class winningFrame extends JFrame {

	public void setUp(int Winning, String Player1){
		this.setSize(250,250);
		this.setVisible(true);
		this.setResizable(false);
		this.setTitle("Congratulations Player " + Winning);
		this.setDefaultLookAndFeelDecorated(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		JPanel Panel= new JPanel();
		Panel.setSize(250,250);
		Panel.setLocation(0,0);
		Panel.setLayout(null);
		Panel.setBackground(Color.BLACK);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width1 = screenSize.getWidth();
		double height1 = screenSize.getHeight();
		int width= (int)width1;
		int height = (int)height1;
		this.setLocation((width/2)-125, (height/2)-125);
		
		this.add(Panel);
		
		String[] colors= new String[4];
		colors[0]="Red";
		colors[1]="Blue";
		colors[2]="Green";
		colors[3]="Yellow";
		
		
		JLabel winningInfo= new JLabel();
		winningInfo.setSize(250,50);
		winningInfo.setLocation(0,50);
		winningInfo.setHorizontalAlignment(JLabel.CENTER);
		winningInfo.setFont(new Font("Segoe UI", Font.BOLD, 15));
		winningInfo.setForeground(new Color(255,140,0));
		Panel.add(winningInfo);
		
		if (Player1=="0"){
			winningInfo.setText("Congratulations Player " + Winning + " (" +colors[Winning-1]+")");
		}else{
			winningInfo.setText("You survived for "+ Player1 + " seconds");
			this.setTitle("You survived for "+ Player1);
		}
	}
}
