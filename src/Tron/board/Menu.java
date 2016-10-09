package Tron.board;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JFrame implements ActionListener{
	public JButton button1, button2, button3, button4, powerButton;
	public void setUp(){
		this.setSize(750,500);
		this.setVisible(true);
		this.setResizable(false);
		this.setTitle("Tron");
		this.setDefaultLookAndFeelDecorated(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		
		JPanel backPanel= new JPanel();
		backPanel.setSize(750,500);
		backPanel.setLocation(0,0);
		backPanel.setLayout(null);
		backPanel.setBackground(Color.BLACK);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width1 = screenSize.getWidth();
		double height1 = screenSize.getHeight();
		int width= (int)width1;
		int height = (int)height1;
		this.setLocation((width/2)-375, (height/2)-250);
		
		this.add(backPanel);
		
		JLabel welcomeLabel= new JLabel("TRON");
		welcomeLabel.setFont(new Font("Segoe UI", Font.BOLD, 100));
		welcomeLabel.setSize(750,100);
		welcomeLabel.setLocation(0,2);
		welcomeLabel.setForeground(new Color(255,140,0));
		welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
		welcomeLabel.setVerticalAlignment(JLabel.CENTER);
		backPanel.add(welcomeLabel);
		
		JLabel noOfPlayers= new JLabel("Press the number of players");
		noOfPlayers.setFont(new Font("Segoe UI", Font.BOLD, 20));
		noOfPlayers.setSize(750,50);
		noOfPlayers.setLocation(0,125);
		noOfPlayers.setForeground(new Color(255,140,0));
		noOfPlayers.setHorizontalAlignment(JLabel.CENTER);
		noOfPlayers.setVerticalAlignment(JLabel.TOP);
		backPanel.add(noOfPlayers);
		
		JLabel player1= new JLabel("Arrow Keys");
		player1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		player1.setSize(150,50);
		player1.setLocation(57,330);
		player1.setForeground(Color.RED);
		player1.setHorizontalAlignment(JLabel.CENTER);
		player1.setVerticalAlignment(JLabel.TOP);
		backPanel.add(player1);
		
		JLabel player2= new JLabel("WASD");
		player2.setFont(new Font("Segoe UI", Font.BOLD, 25));
		player2.setSize(150,50);
		player2.setLocation(220,330);
		player2.setForeground(Color.BLUE);
		player2.setHorizontalAlignment(JLabel.CENTER);
		player2.setVerticalAlignment(JLabel.TOP);
		backPanel.add(player2);
		
		JLabel player3= new JLabel("5123");
		player3.setFont(new Font("Segoe UI", Font.BOLD, 25));
		player3.setSize(150,50);
		player3.setLocation(384,330);
		player3.setForeground(Color.GREEN);
		player3.setHorizontalAlignment(JLabel.CENTER);
		player3.setVerticalAlignment(JLabel.TOP);
		backPanel.add(player3);
		JLabel player3Warning= new JLabel("Numpad with");
		player3Warning.setFont(new Font("Segoe UI", Font.BOLD, 15));
		player3Warning.setSize(150,50);
		player3Warning.setLocation(384,380);
		player3Warning.setForeground(Color.GREEN);
		player3Warning.setHorizontalAlignment(JLabel.CENTER);
		player3Warning.setVerticalAlignment(JLabel.TOP);
		backPanel.add(player3Warning);
		JLabel player3Warning1= new JLabel("Num Lock on");
		player3Warning1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		player3Warning1.setSize(150,50);
		player3Warning1.setLocation(384,400);
		player3Warning1.setForeground(Color.GREEN);
		player3Warning1.setHorizontalAlignment(JLabel.CENTER);
		player3Warning1.setVerticalAlignment(JLabel.TOP);
		backPanel.add(player3Warning1);
		
		JLabel player4= new JLabel("IJKL");
		player4.setFont(new Font("Segoe UI", Font.BOLD, 25));
		player4.setSize(150,50);
		player4.setLocation(547,330);
		player4.setForeground(Color.YELLOW);
		player4.setHorizontalAlignment(JLabel.CENTER);
		player4.setVerticalAlignment(JLabel.TOP);
		backPanel.add(player4);
		
		
		JLabel Signature= new JLabel("James Langley");
		Signature.setFont(new Font("Segoe UI", Font.BOLD, 15));
		Signature.setSize(150,50);
		Signature.setLocation(580,410);
		Signature.setForeground(new Color(255,140,0));
		Signature.setHorizontalAlignment(JLabel.RIGHT);
		Signature.setVerticalAlignment(JLabel.BOTTOM);
		backPanel.add(Signature);
		
		JLabel highPower= new JLabel("High Power Mode Beta is");
		highPower.setFont(new Font("Segoe UI", Font.BOLD, 15));
		highPower.setSize(200,50);
		highPower.setLocation(0,0);
		highPower.setForeground(new Color(255,140,0));
		highPower.setHorizontalAlignment(JLabel.RIGHT);
		highPower.setVerticalAlignment(JLabel.BOTTOM);
		backPanel.add(highPower);
		
		powerButton= new JButton("OFF");
		powerButton.setSize(200,50);
		powerButton.addActionListener(this);
		powerButton.setLocation(0,55);
		powerButton.setFont(new Font("Segoe UI", Font.BOLD, 30));
		powerButton.setForeground(new Color(255,140,0));
		powerButton.setOpaque(false);
		powerButton.setContentAreaFilled(false);
		powerButton.setBorderPainted(false);
		backPanel.add(powerButton);
		
		
		button1= new JButton("1");
		button1.setSize(150,150);
		button1.addActionListener(this);
		button1.setLocation(57,175);
		button1.setFont(new Font("Segoe UI", Font.BOLD, 50));
		button1.setForeground(Color.RED);
		button1.setOpaque(false);
		button1.setContentAreaFilled(false);
		button1.setBorderPainted(false);
		backPanel.add(button1);
		
		button2= new JButton("2");
		button2.setSize(150,150);
		button2.addActionListener(this);
		button2.setLocation(220,175);
		button2.setFont(new Font("Segoe UI", Font.BOLD, 50));
		button2.setForeground(Color.BLUE);
		button2.setOpaque(false);
		button2.setContentAreaFilled(false);
		button2.setBorderPainted(false);
		backPanel.add(button2);
		
		button3= new JButton("3");
		button3.setSize(150,150);
		button3.addActionListener(this);
		button3.setLocation(384,175);
		button3.setFont(new Font("Segoe UI", Font.BOLD, 50));
		button3.setForeground(Color.GREEN);
		button3.setOpaque(false);
		button3.setContentAreaFilled(false);
		button3.setBorderPainted(false);
		backPanel.add(button3);
		
		button4= new JButton("4");
		button4.setSize(150,150);
		button4.addActionListener(this);
		button4.setLocation(547,175);
		button4.setFont(new Font("Segoe UI", Font.BOLD, 50));
		button4.setForeground(Color.YELLOW);
		button4.setOpaque(false);
		button4.setContentAreaFilled(false);
		button4.setBorderPainted(false);
		backPanel.add(button4);
		
		this.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button1){
			Tron.Run.run.playerNo=1;
		}
		if (e.getSource()==button2){
			Tron.Run.run.playerNo=2;
		}
		if (e.getSource()==button3){
			Tron.Run.run.playerNo=3;
		}
		if (e.getSource()==button4){
			Tron.Run.run.playerNo=4;
		}
		if (e.getSource()==powerButton){
			if(Tron.Run.run.speed!=20){
				Tron.Run.run.speed=20;
				powerButton.setText("ON");
			}else{
				Tron.Run.run.speed=50;
				powerButton.setText("OFF");
				
			}
		}
		
	}

}
