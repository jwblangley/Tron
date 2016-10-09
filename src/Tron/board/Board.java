package Tron.board;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Tron.entities.Player;

public class Board extends JFrame implements KeyListener{
	
	public JPanel playerPanel = new JPanel();
	public JPanel backPanel = new JPanel();
	public ArrayList spaces =new ArrayList();
	public static JLabel timeLabel;
	
	public void setUp(){
		this.setTitle("Tron");
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.setResizable(false);
		this.addKeyListener(this);
		this.setDefaultLookAndFeelDecorated(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		backPanel.setLayout(null);
		backPanel.setSize(500,500);
		
		
		playerPanel.setLayout(null);
		playerPanel.setSize(500,500);
		playerPanel.setOpaque(false);
		backPanel.add(playerPanel);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width1 = screenSize.getWidth();
		double height1 = screenSize.getHeight();
		int width= (int)width1;
		int height = (int)height1;
		this.setLocation((width/2)-250, (height/2)-250);
		
		
		for (int i=0; i<500; i+=10){
			for(int j=0; j<500; j+=10){
				Space space= new Space();
				space.setUp();
				space.setLocation(i,j);
				space.setVisible(true);
				spaces.add(space);
				backPanel.add(space);
				
		}}
		
		
		timeLabel = new JLabel("0");
		timeLabel.setSize(200,25);
		timeLabel.setHorizontalAlignment(JLabel.RIGHT);
		timeLabel.setForeground(Color.WHITE);
		timeLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		timeLabel.setLocation(290,0);
		playerPanel.add(timeLabel);
		
		backPanel.repaint();
		this.add(backPanel);
		backPanel.repaint();
	}
	public void addNewPlayer(Player player){
		player.setVisible(true);
		playerPanel.add(player);
		
	}
	public Space itemAt(int x, int y){
		for (int i=0; i<spaces.size(); i++){
			Space checkSpace=(Space)spaces.get(i);
			if (checkSpace.getLocation().x==x && checkSpace.getLocation().y==y){
				return checkSpace;
			}
			}
		
			return null;
			
		}
	

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key==KeyEvent.VK_LEFT){
			Tron.Run.run.Direction1="left";
			}
		if(key==KeyEvent.VK_RIGHT){
			Tron.Run.run.Direction1="right";
			}
		if(key==KeyEvent.VK_UP){
			Tron.Run.run.Direction1="up";
			}
		if(key==KeyEvent.VK_DOWN){
			Tron.Run.run.Direction1="down";
			}
		if(key==KeyEvent.VK_A){
			Tron.Run.run.Direction2="left";
			}
		if(key==KeyEvent.VK_D){
			Tron.Run.run.Direction2="right";
			}
		if(key==KeyEvent.VK_W){
			Tron.Run.run.Direction2="up";
			}
		if(key==KeyEvent.VK_S){
			Tron.Run.run.Direction2="down";
			}
		if(key==97){
			Tron.Run.run.Direction3="left";
			}
		if(key==99){
			Tron.Run.run.Direction3="right";
			}
		if(key==101){
			Tron.Run.run.Direction3="up";
			}
		if(key==98){
			Tron.Run.run.Direction3="down";
			}
		if(key==KeyEvent.VK_J){
			Tron.Run.run.Direction4="left";
			}
		if(key==KeyEvent.VK_L){
			Tron.Run.run.Direction4="right";
			}
		if(key==KeyEvent.VK_I){
			Tron.Run.run.Direction4="up";
			}
		if(key==KeyEvent.VK_K){
			Tron.Run.run.Direction4="down";
			}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

}
