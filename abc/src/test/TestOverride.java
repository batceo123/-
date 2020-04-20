/**
 * 
 */
package test;

/**
 * @author 海小飞
 *
 */
class TestOverride {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Car car = new Car();
		car.run();

	}

}
class Vehicle{
	public void run() {
		System.out.println("跑起来");
	}
	
	
}
class Car extends Vehicle{
	public void run() {
		System.out.println("汽车在跑");
	}
	
}