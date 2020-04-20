/**
 * 
 */
package day02;

/**
 * @author 海小飞
 * 
 * 饿汉单例，第一次就加载，线程安全，以空间换时间
 *
 */
public class Singleton {
	private  Singleton() { }   //构造方法私有化
	//直接产生单例实例
	private static final Singleton single=new Singleton();
	public static Singleton getInstance() {       //提供单例对象方法
		return single;
	}
}
