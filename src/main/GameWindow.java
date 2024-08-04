package main;

import javax.swing.JFrame;

public class GameWindow {
	private JFrame jframe;
	public GameWindow(GamePanel gamePanel) {
		// JFrame object
		jframe = new JFrame();
		
		// JFrame window size
		jframe.setSize(400, 400);
		// JSFrame close program when window is closed
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.add(gamePanel);
		jframe.setLocationRelativeTo(null);
		// JFrame window visible
		jframe.setVisible(true);
		
	}
}
