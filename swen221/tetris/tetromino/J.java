package swen221.tetris.tetromino;

import swen221.tetris.logic.Color;

public class J extends Tetromino{
	int[] dx;
	int[] dy;
	 
  public J(int x, int y, Color color) {
	  super(x, y, color);
	    dx = initialDx();
	    dy = initialDy();	
  }

  
  @Override
  public int x(int i) { return centerX() + dx[i]; }

  @Override
  public int y(int i) { return centerY() + dy[i]; }

  @Override
  public void rotateRight() {
	    int[] ndx = new int[]{dy[0], dy[1], dy[2], dy[3]};
	    int[] ndy = new int[]{-dx[0], -dx[1], -dx[2], -dx[3]};
	    dx = ndx;
	    dy = ndy;
  }
  
  protected int[] initialDx() { return new int[]{-1, 0, 1, 1}; }
  protected int[] initialDy() { return new int[]{0, 0, 0, -1}; }
}