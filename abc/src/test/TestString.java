/**
 * 
 */
package test;

/**
 * @author 海小飞
 *
 */
public class TestString {
	public static void main(String[] args) {
		String str;
		StringBuilder sb = new StringBuilder("abcdefg");   //StringBuilder线程不安全，效率高（一般用他）
		//StringBuffer线程安全，效率低
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
		
		sb.setCharAt(2,'H');
		
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
	}

}
