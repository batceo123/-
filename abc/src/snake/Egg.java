package snake;

import java.awt.*;
import java.util.*;

public class Egg {

	private static final int STEP = Yard.BLOCK_SIZE;
	private static Random r = new Random();
	
	private int x, y;

	private Color color = Color.GREEN;
	
	public Egg(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Egg() {
		this(r.nextInt(Yard.COLUMNS), r.nextInt(Yard.ROWS-1)+1);
	}
	
	public void draw(Graphics g) {
		Color c = g.getColor();
		g.setColor(color);
		g.fillOval(x * STEP, y * STEP, STEP, STEP);
		g.setColor(c);
		if(color == Color.GREEN) {
			color = Color.PINK;
		} else {
			color = Color.GREEN;
		}
	}
	
	public Rectangle getRect() {
		return new Rectangle(x * STEP, y * STEP, STEP, STEP);
	}
	
	public void reAppear() {
		this.x = r.nextInt(Yard.COLUMNS);
		this.y = r.nextInt(Yard.ROWS-1)+1;
	}
}
