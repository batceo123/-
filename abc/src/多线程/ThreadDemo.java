/**
 * 
 */
package 多线程;

/**
 * @author 海小飞
 * 
 *通过继承Thread类创建线程
 */
public class ThreadDemo extends Thread{

	public static void main(String[] args) {
		new Thread(new ThreadDemo()).start();

	}
	
	public void run() {     //重写从Thread继承过来的run方法
		System.out.println("这是一个线程！");
	}

}
