package snake;

import java.awt.*;
import java.awt.event.*;

/**
 * java小项目：贪吃蛇游戏<br>
 * 通过上下左右方向箭头控制贪吃蛇的移动<br>
 * 当蛇碰壁或者碰到自己时游戏结束，按F2开始新游戏<br>
 * @author Shine_rise
 *
 */
public class Yard extends Frame {

	public static final int ROWS = 30;
	public static final int COLUMNS = 40;
	public static final int BLOCK_SIZE = 15;
	
	private static final int GAME_WIDTH = COLUMNS * BLOCK_SIZE;
	private static final int GAME_HEIGHT = ROWS * BLOCK_SIZE;

	private boolean gameOver = false;

	public boolean isGameOver() {
		return gameOver;
	}

	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}

	private int score = 0;
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	PaintThread paintThread = new PaintThread();

	Image offStreamImage = null;
	
	Snake s = new Snake(this);
	
	Egg e = new Egg();
	
	public static void main(String[] args) {
		
		new Yard().launchFrame();
	}
	
	public void launchFrame() {
		this.setTitle("贪吃蛇");
		this.setLocation(300, 200);
		this.setResizable(false);
		this.setBackground(Color.LIGHT_GRAY);
		this.setSize(GAME_WIDTH, GAME_HEIGHT);
		this.setVisible(true);
		
		this.addKeyListener(new KeyMonitor());
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				System.exit(0);
			}
		});
		
		new Thread(paintThread).start();
	}

	public void update(Graphics g) {
		
		if(null == offStreamImage) {
			offStreamImage = this.createImage(GAME_WIDTH, GAME_HEIGHT);
		}
		
		Graphics gOffStream = offStreamImage.getGraphics();
		Color c = gOffStream.getColor();
		gOffStream.setColor(Color.LIGHT_GRAY);
		gOffStream.fillRect(0, 0, GAME_WIDTH, GAME_HEIGHT);
		gOffStream.setColor(c);
		paint(gOffStream);
		g.drawImage(offStreamImage, 0, 0, null);
	}
	
	public void paint(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.GRAY);
		
		//画横线
		for(int i=1; i<ROWS; i++) {
			g.drawLine(0, BLOCK_SIZE * i, GAME_WIDTH, BLOCK_SIZE * i);
		}
		
		//画竖线
		for(int i=1; i<COLUMNS; i++) {
			g.drawLine(BLOCK_SIZE * i, 0, BLOCK_SIZE * i, GAME_HEIGHT);
		}
		
		s.draw(g);
		e.draw(g);
		s.eat(e);

		//画分数
		g.setColor(Color.BLUE);
		g.setFont(new Font("方正喵呜体",Font.BOLD,30));
		g.drawString("分数:"+score, 20, 60);
		
		if(gameOver) {
			//game over
			g.setColor(Color.RED);
			g.setFont(new Font("方正喵呜体",Font.BOLD,50));
			g.drawString("哈哈哈！你死了", 150, 200);
			g.setFont(new Font("方正喵呜体",Font.BOLD,30));
			g.drawString("请按 F2键重新开始游戏", 80, 250);
			
			paintThread.gameOver();
		}
		g.setColor(c);
	}
	
	public void stop() {
		gameOver = true;
	}
	
	private class PaintThread implements Runnable {
		public void run() {
			while(true) {
				repaint();
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		public void gameOver() {
			gameOver = true;
		}
	}
	
	private class KeyMonitor extends KeyAdapter {

		public void keyReleased(KeyEvent e) {
			s.keyReleased(e);
		}
		
	}

	public void reStart() {
		gameOver = false;
		s = new Snake(this);
		score = 0;
	}
}
