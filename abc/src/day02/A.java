/**
 * 
 */
package day02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 海小飞
 * 
 * 统一形式解析类的构造方法，成员变量、成员方法
 *
 */
public class A {
	int m;
	public A() {}
	public A(int m) {}
	private void func1() {}
	private void func2() {}
	
	public static void main(String[] args) throws Exception {
		//加载并初始化指定的类A
		Class<?> classinfo=Class.forName("day02.A");
		//获得类的构造函数
		System.out.println("类A的构造函数如下所示：");
		Constructor<?> cons[]=classinfo.getConstructors();
		for (int i = 0; i < cons.length; i++) {
			System.out.println(cons[i].toString());
		}
		
		//获得类的所有变量
		System.out.println();
		System.out.println("类A的变量如下所示：");
		Field fields[]=classinfo.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i].toString());
		}
		
		//获得类的所有方法
		System.out.println();
		System.out.println("类A的方法如下所示：");
		Method methods[]=classinfo.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i].toString());
		}
	}
	


}
