/**
 * 
 */
package 多线程;

import test.NameList;

/**
 * @author 海小飞
 *
 */
public class SynchronizedDemo {
	private int c=5;
	
	public synchronized void increment() {   //方法的同步声明
		c++;
	}
	public synchronized void decrement() {
		c++;
	}
	public synchronized int value() {
		return c;
	}
	
	public void addName() {
		synchronized (this) {   //同步块
			String name = "小飞";
			String lastName = name;
			int nameCount = 0;
			nameCount++;
		}
		NameList nameList = null;
		String name = null;
		nameList.add(name);
	}
	
	public static void main(String[] args) {
		SynchronizedDemo sy=new SynchronizedDemo();
		System.out.println(sy.value());

	}

}
