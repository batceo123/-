/**
 * 
 */
package test;

/**测试数组的拷贝
 * @author 海小飞
 *
 */
public class Lianxi10 {
	public static void main(String[] args) {
	
		//删除数组中指定位置的索引的值，并将原数组返回
		String[] s1 = {"aa","bb","cc","dd","ee"};
		//String[] s2 = new String[10];
		System.arraycopy(s1, 3, s1, 3-1,s1.length-3);   //通过数组拷贝将cc删除
		s1[s1.length-1] = null;
		
		for (int i=0;i<s1.length;i++) {
			System.out.println(i+"--"+s1[i]);
		}
	}

}
