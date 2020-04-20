/**
 * 
 */
package 网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 海小飞
 *
 */
public class TestInetAddress {

	public static void main(String[] args) throws Exception {
		InetAddress ia=null;
		try {
			ia=InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println("本机的主机名为："+ia.getHostName());
		System.out.println("本机的ip为："+ia.getHostAddress());

	}

}
