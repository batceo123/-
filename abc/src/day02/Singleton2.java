/**
 * 
 */
package day02;

/**
 * @author 海小飞
 * 
 * 有同步方法的懒汉单例模式，线程安全，延迟实例化
 *
 */
public class Singleton2 {
	private  Singleton2() { }   //构造方法私有化
	private static Singleton2 single=null;
	
	public static synchronized Singleton2 getInstance() {       //提供单例对象方法
		if (single==null) {
			single=new Singleton2();
		}
		return single;
	}

}
