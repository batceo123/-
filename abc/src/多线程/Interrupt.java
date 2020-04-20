/**
 * 
 */
package 多线程;

/**
 * @author 海小飞
 *
 */
public class Interrupt {
	public static void main(String[] args) throws InterruptedException {
		String messages[]= {
				"消息1",
				"消息2",
				"消息3",
				"消息4"};
		for (int i = 0; i < messages.length; i++) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				return;
			}
			System.out.println(messages[i]);   //输出一个消息
			
		}

	}

}
