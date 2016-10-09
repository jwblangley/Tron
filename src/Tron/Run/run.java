package Tron.Run;

import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;

import Tron.board.Board;
import Tron.board.Menu;
import Tron.board.Space;
import Tron.board.winningFrame;
import Tron.entities.Player;
import Tron.entities.Player_Human;

public class run{
	public static Player_Human player1, player2, player3, player4;
	
	public static String Direction1="";
	public static String Direction2="";
	public static String Direction3="";
	public static String Direction4="";
	public static ArrayList<String> Directions1= new ArrayList<String>();
	public static ArrayList <Player> players;
	public static Board board= new Board();
	public static int playerNo=0;
	public static int speed=50;
	public static void main(String[] args) {
		
		
		Menu menu = new Menu();
		menu.setUp();
		while(playerNo==0){
			try{
				Thread.sleep(10);
			}catch(Exception e){}
		}
		menu.setVisible(false);
		board.setUp();
		
		if (playerNo!=1){
			board.timeLabel.setVisible(false);
		}
		
		Player_Human player1= new Player_Human();
		Player_Human player2= new Player_Human();
		Player_Human player3= new Player_Human();
		Player_Human player4= new Player_Human();
		
		players=new ArrayList();
		
		players.add(player1);
		players.add(player2);
		players.add(player3);
		players.add(player4);
		

		player1.setLocation(170,170);
		player2.setLocation(320,170);
		player3.setLocation(170,320);
		player4.setLocation(320,320);
		
		
		if (playerNo==1){
			players.get(3).alive=false;
			players.get(2).alive=false;
			players.get(1).alive=false;
		}else if(playerNo==2){
			players.get(3).alive=false;
			players.get(2).alive=false;
		}else if(playerNo==3){
			players.get(3).alive=false;
		}
		
		
		Color[] colors= new Color[4];
		colors[0]=Color.RED;
		colors[1]=Color.BLUE;
		colors[2]=Color.GREEN;
		colors[3]=Color.YELLOW;
		for (int i=0;i<players.size(); i++){
			if ( players.get(i).alive){
				players.get(i).setVisible(true);
				players.get(i).setUp(colors[i]);
				board.addNewPlayer(players.get(i));
				board.repaint();
		}}
		
		while (true){
			if(playerNo==1){
				if(!Direction1.matches("")){
					break;
				}
			}else if(playerNo==2){
				if(!Direction1.matches("")&& !Direction2.matches("")){
					break;
				}
			}else if(playerNo==3){
				if(!Direction1.matches("")&& !Direction2.matches("")&& !Direction3.matches("")){
					break;
				}
			}else if(playerNo==4){
				if(!Direction1.matches("")&& !Direction2.matches("")&& !Direction3.matches("") && !Direction4.matches("")){
					break;
				}
			}
		}

		String timeStr = "";
		if(playerNo!=1){
			int alives=4;
			while(alives!=1){
				alives=0;
				for (int i=0;i<players.size();i++){
					if (players.get(i).alive){
						alives++;
					}
				}
				try {
				    Thread.sleep(speed);
				    Update();
				} catch(InterruptedException ex) {
				    Thread.currentThread().interrupt();
				}
			
		}
			
		}else{
			float time=0;
			DecimalFormat df = new DecimalFormat("0.00");
			while(players.get(0).alive){
				if (speed==50){
					time+=0.05;
				}else{
					time+=0.02;
				}
			    timeStr=df.format(time);
			    board.timeLabel.setText(timeStr);
				try {
					Thread.sleep(speed);
					
				    
				    Update();
				} catch(InterruptedException ex) {
				    Thread.currentThread().interrupt();
				}
			}
		}
		if (playerNo!=1){
			for (int i=0; i<players.size();i++){
				if (players.get(i).alive){
					winningFrame youWin = new winningFrame();
					youWin.setUp((i+1),"0");
					break;
				}
			}
		}else{
			winningFrame youWin = new winningFrame();
			youWin.setUp((0),timeStr);
		}
		
	}
		
				

	
	
	public static void Update(){
		
		for (int i=0; i<players.size();i++){
			Player tempPlayer=players.get(i);
			if (tempPlayer.alive){
			int x=tempPlayer.getLocation().x;
			int y=tempPlayer.getLocation().y;
			if (y<0||y>480||x<0||x>480){
				tempPlayer.alive=false;
			}
			if (tempPlayer.alive){
				if (board.itemAt(x, y).ownColor!=Color.BLACK){
					tempPlayer.alive=false;
					
			}}
			}
		}
		
		for (int i=0;i<players.size(); i++){
			Player tempPlayer=players.get(i);
			if (tempPlayer.alive){
		    int xLoc = tempPlayer.getLocation().x;
		    int yLoc = tempPlayer.getLocation().y;
		    Space toColor = board.itemAt(xLoc,yLoc);
		    if (toColor!=null){
		    	toColor.colorize(tempPlayer.ownColor);
		    }
		    }
		}
		
		
		if (players.get(0).alive){
		if (Direction1.matches("up")){
			Player movingPlayer = (Player) players.get(0); 
			int x=movingPlayer.getLocation().x;
			int y=movingPlayer.getLocation().y;
			movingPlayer.setLocation(x,y-10);
		}else if(Direction1.matches("down")){
			Player movingPlayer = (Player) players.get(0);
			int x=movingPlayer.getLocation().x;
			int y=movingPlayer.getLocation().y;
			movingPlayer.setLocation(x,y+10);
		}else if(Direction1.matches("right")){
			Player movingPlayer = (Player) players.get(0);
			int x=movingPlayer.getLocation().x;
			int y=movingPlayer.getLocation().y;
			movingPlayer.setLocation(x+10,y);
		}else if(Direction1.matches("left")){
			Player movingPlayer = (Player) players.get(0);
			int x=movingPlayer.getLocation().x;
			int y=movingPlayer.getLocation().y;
			movingPlayer.setLocation(x-10,y);
		}}
		if (players.get(1).alive){
		if (Direction2.matches("up")){
			Player movingPlayer = (Player) players.get(1); 
			int x=movingPlayer.getLocation().x;
			int y=movingPlayer.getLocation().y;
			movingPlayer.setLocation(x,y-10);
		}else if(Direction2.matches("down")){
			Player movingPlayer = (Player) players.get(1);
			int x=movingPlayer.getLocation().x;
			int y=movingPlayer.getLocation().y;
			movingPlayer.setLocation(x,y+10);
		}else if(Direction2.matches("right")){
			Player movingPlayer = (Player) players.get(1);
			int x=movingPlayer.getLocation().x;
			int y=movingPlayer.getLocation().y;
			movingPlayer.setLocation(x+10,y);
		}else if(Direction2.matches("left")){
			Player movingPlayer = (Player) players.get(1);
			int x=movingPlayer.getLocation().x;
			int y=movingPlayer.getLocation().y;
			movingPlayer.setLocation(x-10,y);
		}}
		if (players.get(2).alive){
		if (Direction3.matches("up")){
			Player movingPlayer = (Player) players.get(2); 
			int x=movingPlayer.getLocation().x;
			int y=movingPlayer.getLocation().y;
			movingPlayer.setLocation(x,y-10);
		}else if(Direction3.matches("down")){
			Player movingPlayer = (Player) players.get(2);
			int x=movingPlayer.getLocation().x;
			int y=movingPlayer.getLocation().y;
			movingPlayer.setLocation(x,y+10);
		}else if(Direction3.matches("right")){
			Player movingPlayer = (Player) players.get(2);
			int x=movingPlayer.getLocation().x;
			int y=movingPlayer.getLocation().y;
			movingPlayer.setLocation(x+10,y);
		}else if(Direction3.matches("left")){
			Player movingPlayer = (Player) players.get(2);
			int x=movingPlayer.getLocation().x;
			int y=movingPlayer.getLocation().y;
			movingPlayer.setLocation(x-10,y);
		}}
		if (players.get(3).alive){
		if (Direction4.matches("up")){
			Player movingPlayer = (Player) players.get(3); 
			int x=movingPlayer.getLocation().x;
			int y=movingPlayer.getLocation().y;
			movingPlayer.setLocation(x,y-10);
		}else if(Direction4.matches("down")){
			Player movingPlayer = (Player) players.get(3);
			int x=movingPlayer.getLocation().x;
			int y=movingPlayer.getLocation().y;
			movingPlayer.setLocation(x,y+10);
		}else if(Direction4.matches("right")){
			Player movingPlayer = (Player) players.get(3);
			int x=movingPlayer.getLocation().x;
			int y=movingPlayer.getLocation().y;
			movingPlayer.setLocation(x+10,y);
		}else if(Direction4.matches("left")){
			Player movingPlayer = (Player) players.get(3);
			int x=movingPlayer.getLocation().x;
			int y=movingPlayer.getLocation().y;
			movingPlayer.setLocation(x-10,y);
		}}
		
		
		
		
	}
	
}

	


