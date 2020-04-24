package com.snake.ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenu extends JFrame {
	private JButton playButton;
	private JButton quitButton;
	private JLabel gameLabel;
	
	public MainMenu() {
		Container cp = getContentPane();
		cp.setLayout(new BoxLayout(cp, BoxLayout.Y_AXIS));
		
		gameLabel = new JLabel("Snake");
		gameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		cp.add(gameLabel);
		
		playButton = new JButton("Play");
		playButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		cp.add(playButton);
		
		quitButton = new JButton("Quit");
		quitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		quitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
		});
		cp.add(quitButton);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Snake");
		setSize(500, 500);
		
	}
	
	public JButton getPlayButton() {
		return playButton;
	}
}
