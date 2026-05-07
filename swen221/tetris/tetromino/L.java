package swen221.tetris.tetromino;

import swen221.tetris.logic.Color;

public class L extends J{
  public L(int x, int y, Color color) {
	  super(x, y, color);
  }
  
  @Override
  protected int[] initialDx() { return new int[]{-1, 0, 1, -1}; }
}
