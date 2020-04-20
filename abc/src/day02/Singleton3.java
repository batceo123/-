/**
 * 
 */
package day02;

/**
 * @author 海小飞
 *
 */
public class Singleton3 {
	private static class My{
		private static final Singleton3 single=new Singleton3();
	}
	
	private Singleton3() {
		System.out.println("这是一个新实例！");
	}
	public static final Singleton3 getInstance() {       //提供单例对象方法
		return My.single;
	}
		
	

}
