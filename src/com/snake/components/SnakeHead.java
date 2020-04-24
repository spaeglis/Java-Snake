package com.snake.components;

import java.util.Random;

public class SnakeHead {
	private static final int WINDOW_WIDTH = 500;
	private static final int WINDOW_HEIGHT = 500;
	private int x_pos;
	private int y_pos;
	private enum Direction {
		UP,
		DOWN,
		LEFT,
		RIGHT
	};
	Direction playerDir;
	
	public SnakeHead() {
		Random r = new Random();
		x_pos = r.nextInt(WINDOW_WIDTH + 1);
		y_pos = r.nextInt(WINDOW_HEIGHT + 1);
		playerDir = Direction.values()[r.nextInt(Direction.values().length)];
	}

	public int getXPos() {
		return x_pos;
	}
	
	public int getYPos() {
		return y_pos;
	}
	
	public Direction getPlayerDir() {
		return playerDir;
	}
}
