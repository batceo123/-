/**
 * 
 */
package test;

/**
 * @author 海小飞
 *兔子出生问题（裴波那契数列）
 */
public class Lianxi01 {
   public static void main(String[] args) {
	   System.out.println("第1个月的兔子对数: 1");
	   System.out.println("第2个月的兔子对数: 1");
	   int f1 = 1, f2 = 1, M=24;
	   for(int i=3; i<=M; i++) {
		   f1=f1+f2;
		   f2=f1+f2;
		   System.out.println("第" + i +"个月的兔子对数: "+f2);
	   }
   }
}