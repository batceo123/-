/**
 * 
 */
package 多线程;

/**
 * @author 海小飞
 *
 */
public class Lock {
	private long m1=0;
	private long m2=0;
	
	private Object lock1=new Object();   //创建对象lock1作为一个锁
	private Object lock2=new Object();
	
	public void addm1() {
		synchronized (lock1) {
			m1++;
		}
	}
	public void addm2() {
		synchronized (lock2) {
			m2++;
		}
	}
	
	

}
