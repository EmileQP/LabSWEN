package swen221.tetris.tetromino;

import swen221.tetris.logic.Color;

public class O extends Tetromino{
  public O(int x, int y, Color color) {
	  super(x, y, color);
    
  }

  @Override
  public int x(int i) { return centerX() + (i % 2); }

  @Override
  public int y(int i) { return centerY() + (i / 2); 
  }

  @Override
  public void rotateRight() {}
  
}
