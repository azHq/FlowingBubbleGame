package makingGame;

import java.util.*;
//import java.util.Timer;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.*;
import javax.swing.Timer;


public class CreateBall {
	
	
	public int[][] arr1;
	//public int[] arr2;
	
	public CreateBall(int a,int b) {
		
		arr1=new int[a][b];
		//arr2=new int[a];
	
	}
	public int[][] draw(Graphics g) {
				
		
				Random rand=new Random();
				arr1[0][0]	=rand.nextInt(600);
				arr1[1][0]=rand.nextInt(10);
						
				g.setColor(Color.red);
				g.fillOval(arr1[0][0],arr1[1][0],30,30);
						
						
				arr1[0][1]	=rand.nextInt(500);
				arr1[2][0]=rand.nextInt(50);		
				g.setColor(Color.yellow);
				g.fillOval(arr1[0][1],arr1[2][0],30,30);
				
				arr1[0][2]	=rand.nextInt(400);
				arr1[3][0]=rand.nextInt(100);		
				g.setColor(Color.blue);
				g.fillOval(arr1[0][2],arr1[3][0],30,30);
						
					
				arr1[0][3]	=rand.nextInt(300);
				arr1[4][0]=rand.nextInt(250);		
				g.setColor(Color.white);
				g.fillOval(arr1[0][3],arr1[4][0],20,20);
						
						//g.setColor(Color.red);
						//g.fillOval(a+100,b+550,20,20);
						
						//g.setColor(Color.blue);
						//g.fillOval(a+350,b+650,30,30);
						
						
		return arr1;
	}
				

}
