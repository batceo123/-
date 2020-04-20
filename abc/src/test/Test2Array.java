/**
 * 
 */
package test;

/**二维数组的测试使用
 * @author 海小飞
 *
 */
public class Test2Array {

	
	public static void main(String[] args) {
		
		int a[][] = new int[3][];
		
		a[0] = new int[] {10,20,30};
		a[1] = new int[] {4,8};
		a[2] = new int[] {90,76,65,45};
		
		System.out.println(a[2][2]);
		//静态初始化数组
		
		int b[][] =  {
			{10,20,30},
			{10,20,30},
			{10,20,30},
		};
		System.out.println(b[2][2]);

	}

}
