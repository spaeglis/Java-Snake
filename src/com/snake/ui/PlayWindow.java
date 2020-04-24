package com.snake.ui;

import com.snake.components.*;

import java.awt.Container;

import javax.swing.*;

public class PlayWindow extends JFrame {
	private static final int WINDOW_WIDTH = 500;
	private static final int WINDOW_HEIGHT = 500;
	
	private SnakeHead player;
	
	public PlayWindow() {
		player = new SnakeHead();
		
		System.out.println(player.getXPos());
		System.out.println(player.getYPos());
		System.out.println(player.getPlayerDir());
		
		Container cp = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Snake");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	}
}
