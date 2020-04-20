/**
 * 
 */
package test;

/**
 * @author 海小飞
 *水仙花数问题
 */
public class Lianxi02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a,b,c;
		for (int m=101;m<=1000;m++) {
			a=m/100;
			b=m%100/10;
			c=m%10;
			if(a*a*a+b*b*b+c*c*c==m) {
				System.out.println(m+"是一个水仙花数"); 
			}
		}
	}
}
