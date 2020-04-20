/**
 * 
 */
package test;

/**
 * @author 海小飞
 *
 */
public class TestSuper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new childclass().f();
	}
}
class Fatherclass{
	public int value;
	
	public void f() {
		value = 100;
		System.out.println("Fatherclass.value="+value);
	}
}
class childclass extends Fatherclass{
	public int value;
	
	public void f() {
		super.f();
		value = 200;
		System.out.println("childclass.value="+value);
		System.out.println(value);
		System.out.println(super.value);
	}
}
