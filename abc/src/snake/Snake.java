/**
 * 
 */
package snake;

/**
 * @author Administrators
 *
 */
import java.awt.*;
import java.awt.event.*;

public class Snake {
	
	private Node head = null;
	private Node tail = null;
	private int size = 0;
	
	private Node n = new Node(20, 15, Direction.L);
	
	Yard yard;
	
	public Snake(Yard yard) {
		head = n;
		tail = n;
		size = 1;
		this.yard = yard;
	}
	
	//双向链表
	private void addtoTail() {
		Node node = null;
		switch(tail.dir) {
		case L:
			node = new Node(tail.x + 1, tail.y, tail.dir);
			break;
		case U:
			node = new Node(tail.x, tail.y + 1, tail.dir);
			break;
		case R:
			node = new Node(tail.x - 1, tail.y, tail.dir);
			break;
		case D:
			node = new Node(tail.x, tail.y - 1, tail.dir);
			break;
		}
		
		tail.next = node;
		node.previous = tail;
		tail = node;
		size++;
	}
	
	private void addtoHead() {
		Node node = null;
		switch(head.dir) {
		case L:
			node = new Node(head.x - 1, head.y, head.dir);
			break;
		case U:
			node = new Node(head.x, head.y - 1, head.dir);
			break;
		case R:
			node = new Node(head.x + 1, head.y, head.dir);
			break;
		case D:
			node = new Node(head.x, head.y + 1, head.dir);
			break;
		}
		
		node.next = head;
		head.previous = node;
		head = node;
		size++;
	}
	
	public void eat(Egg e) {
		if(this.getRect().intersects(e.getRect())) {
			this.addtoHead();
			e.reAppear();
			yard.setScore(yard.getScore() + 5);
		}
	}
	
	public Rectangle getRect() {
		return new Rectangle(head.x * Yard.BLOCK_SIZE, head.y * Yard.BLOCK_SIZE, Yard.BLOCK_SIZE, Yard.BLOCK_SIZE);
	}
	
	public void draw(Graphics g) {
		if(size <= 0) return;
		move();
		for(Node n = head; n != null; n = n.next) {
			n.draw(g);
		}
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		switch(key) {
		case KeyEvent.VK_LEFT:
			if(head.dir != Direction.R)
				head.dir = Direction.L;
			break;
		case KeyEvent.VK_UP:
			if(head.dir != Direction.D)
				head.dir = Direction.U;
			break;
		case KeyEvent.VK_RIGHT:
			if(head.dir != Direction.L)
			head.dir = Direction.R;
			break;
		case KeyEvent.VK_DOWN:
			if(head.dir != Direction.U)
			head.dir = Direction.D;
			break;
		case KeyEvent.VK_F2:
			yard.reStart();
			break;
		}
	}

	private void move() {
		if(yard.isGameOver() == false) {
			addtoHead();
			deletefromTail();
			checkDead();
		}
	}
	
	private void checkDead() {
		if(head.x < 0 || head.x >= Yard.COLUMNS || head.y <= 0 || head.y >= Yard.ROWS) {
			yard.stop();
		}
		
		for(Node n = head.next; n != null; n = n.next) {
			if(head.x == n.x && head.y == n.y) {
				yard.stop();
			}
		}
	}
	
	private void deletefromTail() {
		if(size <= 0) return;
		tail = tail.previous;
		tail.next = null;
	}
	
	private class Node {
	
		private static final int STEP = Yard.BLOCK_SIZE;
		private int x, y;

		Node next = null;
		Node previous = null;
		
		Direction dir;
		
		public Node(int x, int y, Direction dir) {
			this.x = x;
			this.y = y;
			this.dir = dir;
		}
		
		private void draw(Graphics g) {
			Color c = g.getColor();
			g.setColor(Color.BLACK);
			g.fillRect(x * STEP, y * STEP, STEP, STEP);
			g.setColor(c);
		}
		
	}
	
}
