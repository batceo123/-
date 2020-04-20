/**
 * 
 */
package cn.hhh;


/**
 * @author 海小飞
 *
 *共享资源，并发（线程安全）
 */
public class Web12306 implements Runnable{
	private int ticketNums=99;
	@Override
	public void run() {
		while (true) {
			if (ticketNums<0) {
				break;
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"-->"+ticketNums--);
		}
		
	}
	public static void main(String[] args) {
		//一份资源
		Web12306 web=new Web12306();
		//多个代理
		new Thread(web,"hh").start();
		new Thread(web,"kk").start();
		new Thread(web,"gg").start();
	}

}
