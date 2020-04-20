/**
 * 
 */
package 多线程;

/**
 * @author 海小飞
 *
 */
public class Join implements Runnable{
	public static int a=0;        //声明静态变量a
	public static void main(String[] args) throws InterruptedException {
		Runnable r=new Join();
		Thread t=new Thread(r);  //创建另一个线程
		t.start();                 //启动线程
		t.join();                //当前线程阻塞执行，等待线程t执行完毕
		System.out.println(a);

	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			a=a+1;
			
		}
	}

}
