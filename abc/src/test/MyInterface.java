/**
 * 
 */
package test;

/**
 * @author 海小飞
 *
 */
public interface MyInterface {
	void fly();
	void eat();
	void sleep();
	
}
class Man implements MyInterface{	
	@Override
	public void fly() {	
		System.out.println("飞");
	}	
	@Override
	public void eat() {	
		System.out.println("吃饭");
	}	
	@Override
	public void sleep() {	
		System.out.println("睡觉");
	}
	
}