/**
 * 
 */
package test;

/**
 * 测试泛型
 * @author 海小飞
 *
 */
public class TestGenerics {

	public static void main(String[] args) {
		
		// 这里的”String”就是实际传入的数据类型；
		MyCollection<String> mc = new MyCollection<String>();
		mc.setObj("海小飞", 0);
		//mc.setObj(8888, 1);
		
		//Integer a  = (Integer)mc.getObj(1);
		//加了泛型，直接返回String类型，不用强制转换;
		String b = mc.get(0);
			System.out.println(b);

	}
}

class MyCollection<E>{
	Object[] objs = new Object[5];
	public void setObj(E e,int index) {
		 objs[index] = e;
	}
	public E get(int index) {
		return (E)objs[index];
	}	
	
}
