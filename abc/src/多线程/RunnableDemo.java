/**
 * 
 */
package 多线程;

/**
 * @author 海小飞
 * 
 *通过实现Runnable接口创建新的线程
 */
public class RunnableDemo implements Runnable{

	public static void main(String[] args) {
		(new Thread(new RunnableDemo())).start();

	}
	@Override
	public void run() {      //实现Runnable接口，，实现该接口中的run方法
		System.out.println("这是一个线程！");
		
	}

}
