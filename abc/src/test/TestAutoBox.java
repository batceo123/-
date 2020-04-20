/**
 * 
 */
package test;

/**
 * 测试自动装箱/拆箱
 * @author 海小飞
 *
 */
public class TestAutoBox {

	
	public static void main(String[] args) {
		
		Integer a = 234;   //自动装箱     Integer a = Integer.valueOf(234);
		int b = a;        //自动拆箱        int b = a.intValue();

	}

}
