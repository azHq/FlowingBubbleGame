package makingGame;

import java.util.*;
//import java.util.Timer;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.*;
import javax.swing.Timer;

public class FlowingGame extends JPanel implements KeyListener,ActionListener {
	private static final Graphics Graphics = null;

	private int score=0;
	
	private final int Time=60;
	private int count=0;
	
	Random rand=new Random();

	private int ballposX=rand.nextInt(600);
	private int ballposY=-90;    //rand.nextInt(4);
	private boolean play=false;
	
	private int f1=0,f2=0,f3=0,f4=0;
	private int f5=0,f6=0,f7=0,f8=0;
	
	private int balldir1Y=1;
	private int balldir2Y=3;
	private int balldir3Y=4;
	private int balldir4Y=8;
	
	private int a;
	
	private int balldirX=-1;
	
	
	private int playerposX=300;
	private int playerposY=950;
	
	private Timer timer;
	private int delay=6;
	
	public int[][] arr;
	public int[][] brr;
	
	//private CreateBall createball;
	public FlowingGame() {
		
		
		
		
		//createball=new CreateBall(5,4);
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer=new Timer(delay,this);
		timer.start();
		
		arr=new int[5][4];
		brr=new int[5][4];
		arr[1][0]=-90;
		arr[2][0]=-150;
		
		arr[3][0]=-300;
		arr[4][0]=-400;
		arr[0][0]=200;
		for(int i=0;i<4;i++) {
			arr[0][i]=arr[0][i]+50;
		}
		brr[1][0]=100;
		for(int i=1;i<5;i++) {
			brr[i][0]=-(i*30);
		}
		brr[0][0]=0;
		for(int i=0;i<4;i++) {
			brr[0][i]=brr[0][i]+150;
		}
		
	}
	
	public void paint(Graphics g) {
		
		g.setColor(Color.black);
		g.fillRect(1, 1,712,992);
		
		gameOver(g);
		configuration(g);
		
		draw( g);
		
		
		
		
		
		
		
		g.setColor(Color.green);
		g.fillRect(playerposX,playerposY,120,10);
		
		g.setColor(Color.red);
		g.setFont(new Font("serif",Font.BOLD,25));
		g.drawString("CREATED BY MD.AZAZUL HAQUE",150,850);
		
		g.dispose();
		
	}
	public void gameOver(Graphics g) {
		if(count>=60) {
			play=false;
			g.setColor(Color.red);
			g.setFont(new Font("serif",Font.BOLD,30));
			g.drawString("Game Over",310,330);
			g.drawString("Your Score :"+score,310,380);
			g.drawString("Press Enter to Resart",310,420);
		}
	}
	public void configuration(Graphics g) {
		
		g.setColor(Color.red);
		g.fillOval(660,20,15,15);
		
		g.setColor(Color.green);
		g.setFont(new Font("serif",Font.BOLD,20));
		g.drawString("- 50",678,33);
		
		g.setColor(Color.yellow);
		g.fillOval(660,42,15,15);
		
		g.setColor(Color.green);
		g.setFont(new Font("serif",Font.BOLD,20));
		g.drawString("- 20",678,55);
		
		g.setColor(Color.blue);
		g.fillOval(660,64,15,15);
		
		g.setColor(Color.green);
		g.setFont(new Font("serif",Font.BOLD,20));
		g.drawString("- 10",678,77);
		
		g.setColor(Color.white);
		g.fillOval(660,86,15,15);
		
		g.setColor(Color.green);
		g.setFont(new Font("serif",Font.BOLD,20));
		g.drawString("- 5",678,99);
		
		g.setColor(Color.green);
		g.setFont(new Font("serif",Font.BOLD,20));
		g.drawString("Time: "+Time+"Sec",600,16);
		
		g.setColor(Color.red);
		g.setFont(new Font("serif",Font.BOLD,20));
		g.drawString("Score: "+score,10,20);
		g.drawString("Timer: "+count,10,40);
		
	}
	public void draw(Graphics g) {
		
		
		Random rand=new Random();
		if(f1==1&&count<60) {
			arr[0][0]	=rand.nextInt(600);
			arr[1][0]=rand.nextInt(10);
		}
			
		 //arr[1][0]=arr[1][0]+50;		
		g.setColor(Color.red);
		g.fillOval(arr[0][0],arr[1][0],30,30);
		System.out.println(arr[0][0]+","+arr[1][0]);
				
		if(f2==1) {		
			arr[0][1]=rand.nextInt(500);
			arr[2][0]=rand.nextInt(20);	
		}
			
		g.setColor(Color.yellow);
		g.fillOval(arr[0][1],arr[2][0],30,30);
		
		
		if(f3==1) {
			arr[0][2]=rand.nextInt(400);
			arr[3][0]=rand.nextInt(30);
		}
		g.setColor(Color.blue);
		g.fillOval(arr[0][2],arr[3][0],30,30);
				
		if(f4==1){
			arr[0][3]=rand.nextInt(300);
			arr[4][0]=rand.nextInt(25);
		}
			
		g.setColor(Color.white);
		g.fillOval(arr[0][3],arr[4][0],30,30);
				
		
		//brr start from here
		
		if(f5==1) {
			brr[0][0]=rand.nextInt(650);
			brr[1][0]=rand.nextInt(240);
		}
			
		 //arr[1][0]=arr[1][0]+50;		
		/*g.setColor(Color.red);
		g.fillOval(arr[0][0],arr[1][0],30,30);
		//System.out.println(arr[0][0]+","+arr[1][0]);*/
				
		if(f6==1) {		
			brr[0][1]=rand.nextInt(550);
			brr[2][0]=-rand.nextInt(120);	
		}
			
		g.setColor(Color.yellow);
		g.fillOval(brr[0][1],brr[2][0],30,30);
		
		
		if(f7==1) {
			brr[0][2]=rand.nextInt(400);
			brr[3][0]=-rand.nextInt(90);
		}
		g.setColor(Color.blue);
		g.fillOval(brr[0][2],brr[3][0],30,30);
				
		if(f8==1){
			brr[0][3]=rand.nextInt(500);
			brr[4][0]=-rand.nextInt(65);
		}
			
		g.setColor(Color.white);
		g.fillOval(brr[0][3],brr[4][0],30,30);
				
				
				
	
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		timer.start();
		if(play==true) {
			//CreateBall createball=new CreateBall();
			//createball.paint();
			
			f1=0;
			f2=0;
			f3=0;
			f4=0;
			
			f5=0;
			f6=0;
			f7=0;
			f8=0;
			
			arr[1][0]+=balldir4Y;
			arr[2][0]+=balldir3Y;
			arr[3][0]+=balldir2Y;
			arr[4][0]+=balldir1Y;
			
			//brr[1][0]+=balldir4Y;
			brr[2][0]+=balldir3Y;
			brr[3][0]+=balldir2Y;
			brr[4][0]+=balldir1Y;
			
			
			
			
		if(new Rectangle(arr[0][0],arr[1][0],30,30).intersects(new Rectangle(playerposX,playerposY,120,10))||arr[1][0]>=950){
			
			f1=1;
			f2=0;
			f3=0;
			f4=0;
			arr[0][0]+=700;
			count++;
			if(arr[1][0]<940) score=score+50;
			//System.out.println("azaz"+arr[1][0]);
				
		}
		if(new Rectangle(arr[0][1],arr[2][0],30,30).intersects(new Rectangle(playerposX,playerposY,120,10))||arr[2][0]>=950){
			
			f2=1;
			f1=0;
			f3=0;
			f4=0;
			arr[0][1]+=700;
			if(arr[2][0]<940) score=score+20;
			
		}
		if(new Rectangle(arr[0][2],arr[3][0],30,30).intersects(new Rectangle(playerposX,playerposY,120,10))||arr[3][0]>=950){
			
			f3=1;
			f2=0;
			f1=0;
			f4=0;
			arr[0][2]+=700;
			if(arr[3][0]<940) score=score+10;
		}
		if(new Rectangle(arr[0][3],arr[4][0],30,30).intersects(new Rectangle(playerposX,playerposY,120,10))||arr[4][0]>=950){
			
			f4=1;
			f3=0;
			f2=0;
			f1=0;
			
			arr[0][3]+=700;
			if(arr[4][0]<940) score=score+5;
		}
		
		
		
		//brr start from here
		/*if(new Rectangle(brr[0][0],brr[1][0],30,30).intersects(new Rectangle(playerposX,playerposY,120,10))||brr[1][0]>=950){
			
			f5=1;
			f2=0;
			f3=0;
			f4=0;
			brr[0][0]+=700;
			
			//System.out.println("azaz"+arr[1][0]);
				
		}*/
		if(new Rectangle(brr[0][1],brr[2][0],30,30).intersects(new Rectangle(playerposX,playerposY,120,10))||brr[2][0]>=950){
			
			f6=1;
			f1=0;
			f3=0;
			f4=0;
			brr[0][1]+=700;
			if(brr[2][0]<940) score=score+20;
			
			
		}
		if(new Rectangle(brr[0][2],brr[3][0],30,30).intersects(new Rectangle(playerposX,playerposY,120,10))||brr[3][0]>=950){
			
			f7=1;
			f2=0;
			f1=0;
			f4=0;
			brr[0][2]+=700;
			if(brr[3][0]<940) score=score+10;
		}
		if(new Rectangle(brr[0][3],brr[4][0],30,30).intersects(new Rectangle(playerposX,playerposY,120,10))||brr[4][0]>=950){
			
			f8=1;
			f3=0;
			f2=0;
			f1=0;
			
			brr[0][3]+=700;
			if(arr[4][0]<940) score=score+5;
		}
		
		System.out.println("azaz"+arr[1][0]);
		
		}
		repaint();
		if(count>=60) return;
	
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			if(playerposX<10) {
				playerposX=10;
			}
			else {
				
				moveLeft();
			}
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			if(playerposX>=600) {
				playerposX=600;
			}
			else {
				moveRight();
			}
		}
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			if(playerposY<=10) {
				playerposY=10;
			}
			else {
				moveUp();
			}
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			if(playerposY>=950) {
				playerposY=950;
			}
			else {
				moveDown();
			}
		}
		
	}
	public void moveRight() {
		play=true;
		playerposX+=30;
		
	}
	public void moveLeft() {
		play=true;
		playerposX-=30;
		
	}
	public void moveUp() {
		play=true;
		playerposY-=10;
		
	}
	public void moveDown() {
		play=true;
		playerposY+=10;
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
