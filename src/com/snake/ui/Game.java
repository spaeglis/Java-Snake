package com.snake.ui;

import javax.swing.SwingUtilities;
import java.awt.event.*;

public class Game {
	private MainMenu menu;
	private PlayWindow playWindow;
	
	public Game() {
		menu = new MainMenu();
		menu.setVisible(true);
		
		menu.getPlayButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				playGame();
				
			}
			
		});
	}
	
	public void playGame() {
		playWindow = new PlayWindow();
		menu.setVisible(false);
		playWindow.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Game();
			}
		});

	}

}
