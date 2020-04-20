/**
 * 
 */
package day02;

import java.lang.reflect.Method;

/**
 * @author 海小飞
 * 
 * 统一形式调用成员方法
 *
 */
public class Test {
	private void func1() {
		System.out.println("this is func1:");
	}
	private void func2(Integer m) {
		System.out.println("this is func2:"+m);
	}
	private void func3(String s,Integer m) {
		System.out.println("this is func2:"+s+m);
	}
	
	public static void main(String[] args) throws Exception {
		Class<?> classinfo=Class.forName("day02.Test");
		
		//调用无参构造函数，生成新的实例对象
		Object obj=classinfo.getConstructor().newInstance();
		
		//调用无参成员函数func1
		Method mt1=classinfo.getDeclaredMethod("func1");
		mt1.invoke(obj);
		
		//调用1个参数成员函数func2
		Method mt2=classinfo.getDeclaredMethod("func2",Integer.class);
		mt2.invoke(obj, new Object[] {10});
		
		//调用2个参数成员函数func2
		Method mt3=classinfo.getDeclaredMethod("func3",String.class,Integer.class);
		mt3.invoke(obj, new Object[] {"Hello",2010});
	}

}
