package test;

/**
 * @author 海小飞
 *
 */
public class TestObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Object to = new Object();
		System.out.println(to.toString());
		
		person per = new person("云儿" ,6);
		System.out.println(per.toString());

	}
	public String toString() {
		return "你好";
	}
}
class person{
	String name;
	int age;
	@Override
	public String toString() {
		return "姓名:"+name+"年龄:"+age;
	}
	public person(String name,int age){
		this.name = name;
		this.age = age;
	}
}
 
