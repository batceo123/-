/**
 * 
 */
package test;

/**
 * 测试自定义异常
 * @author 海小飞
 *
 */
public class Lianxi12 {
	public static void main(String[] args) throws IllegalAgeException {
		Person2 person  = new Person2();
		person.setAge(10);
		
	System.out.println(person.getAge());
	}

}

class Person2{
	private int age;

	
	public int getAge() {
		return age;
	}

	
	public void setAge(int age) throws IllegalAgeException {
		
		if (age<0) {
			throw new IllegalAgeException("年龄不能为负数！");
		}
		this.age = age;
	}
	
	
}

@SuppressWarnings("serial")
class IllegalAgeException extends Exception{ //继承RuntimeException时上面语句不用抛出异常
	//默认构造器
	public IllegalAgeException() {
		
	}
	
	//带有详细信息的构造器，信息存储在message中
public IllegalAgeException(String msg) {
		super(msg);
	}
}
