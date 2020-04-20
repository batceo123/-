package 多线程;

/**
 * @author 海小飞
 *
 */
public class SimpleThreadDemo{
	//显示消息， 消息前是当前线程的名字
	static void printThreadMessage(String message) {
		String threadName = Thread.currentThread().getName();
		System.out.format("%s: %s%n", threadName, message);	//格式化输出线程信息
	}
	//私有静态内部类，实现了Runnable接口
	private static class MessageLoop implements Runnable {
		public void run() {
			String info[] = {"消息1","消息2","消息3","消息4"};
			try {
				for (int i = 0; i < info.length; i++) {					
					Thread.sleep(4000); 					//暂停4秒	
					printThreadMessage(info[i]); 				//输出消息
				}
			} catch (InterruptedException e) {
				printThreadMessage("不能正常工作。");
			}
		}
	}
	public static void main(String args[]) throws InterruptedException {
		//在中断MessageLoop线程之前延迟的毫秒数（默认是一个小时）.
		long delay = 1000 * 60 * 60;
		//如果有命令行参数，那么在命令行参数中给出延迟的时间.
		if (args.length > 0) {
			try {
				delay = Long.parseLong(args[0]) * 1000;//将命令行中的第一个参数解析为整数（秒）
			} catch (NumberFormatException e) {
				System.err.println("参数必须是整数.");
				System.exit(1);
			}
		}
		printThreadMessage("启动MessageLoop线程......");
		long startTime = System.currentTimeMillis();		//获得当前系统时间
		Thread t = new Thread(new MessageLoop());			//创建线程t
		t.start();										//启动线程t
		printThreadMessage("等待MessageLoop线程结束......");
		//循环直到MessageLoop线程退出
		while (t.isAlive()) {
			printThreadMessage("继续等待...");
			//最多等待1秒钟等待MessageLoop线程结束.
			t.join(1000);								//main线程暂停执行1秒，等待线程t结束
			//如果线程t运行的时间超过了delay指定的时间
			if (((System.currentTimeMillis() - startTime) > delay) && t.isAlive()) {
				printThreadMessage("时间太久了，不再等待!");
				t.interrupt();								//中断线程t
				t.join();								// main线程暂停执行，直到线程t结束为止
			}
		}
		printThreadMessage("MessageLoop线程结束!");
	}
}

	
	