/**
 * 
 */
package test;

import java.util.Arrays;

/**测试java.util.Arrays工具类的使用
 * @author 海小飞
 *
 */
public class TestArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {10,20,4,5,87,28};
		
		System.out.println(a);
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.binarySearch(a, 20));


	}

}
