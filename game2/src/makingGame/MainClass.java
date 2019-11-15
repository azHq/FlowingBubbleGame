package makingGame;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class MainClass {

	//private static final int EXIT_ON_CLOSE = 0;

	public static void main(String[] args) {
		
		JFrame frame=new JFrame("MD.AZAZUL HAQUE");
		frame.setBounds(10,10,720,1000);
		frame.setResizable(false);
		//frame.setSize(700,800);
		//frame.getContentPane().setBackground(Color.black);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JLabel lb=new JLabel("I AM AZAZ");
		
		//lb.setForeground(Color.blue);
		//lb.setFont(new Font("serif",Font.BOLD, 30));
		//frame.add(lb);
		
		
		FlowingGame flowg=new FlowingGame();
		
		
		
		
		frame.add(flowg);
		frame.setVisible(true);

	}

}
