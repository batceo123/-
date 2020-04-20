/**
 * 
 */
package 网络编程;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author 海小飞
 *
 */
public class TestURL {

	public static void main(String[] args) throws Exception{
		URL aURL=null;
		try {
			aURL=new URL("https://www.baidu.com:80");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		System.out.println("协议为："+aURL.getProtocol());
		System.out.println("主机号和端口号为："+aURL.getAuthority());
		System.out.println("主机名为："+aURL.getHost());
		System.out.println("端口号为："+aURL.getPort());

	}

}
