package main;

import javax.swing.JFrame;

import boundary.Keyboard;
import controller.GameController;

public class Main {

	public static void main(String[] args) {
		
		new GameController().gameControl();
		
		JFrame jf = new JFrame("Key Event");
		jf.setSize(100,100);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.addKeyListener(new Keyboard());
		jf.setVisible(true);
	}
	
}
