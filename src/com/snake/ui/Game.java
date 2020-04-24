package com.snake.ui;

import javax.swing.SwingUtilities;
import java.awt.event.*;

public class Game {
	private MainMenu menu;
	
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
		int i = 1;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Game();
			}
		});

	}

}
