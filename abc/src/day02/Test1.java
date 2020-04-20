/**
 * 
 */
package day02;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author 海小飞
 *
 */

interface IMsg{
	void process(String s);
}

class ConsoleMsg implements IMsg{
	@Override
	public void process(String msg) {
		System.out.println(msg);
	}
}

class FileMsg implements IMsg{
	@Override
	public void process(String msg) {
		System.out.println("Save msg to File");
	}
}

public class Test1 {
	public static void main(String[] args) throws Exception{
		Properties p=new Properties();
		p.load(new FileInputStream("src/day02/msg.properties"));
		String cname = p.getProperty("func");
		IMsg obj=null;
		obj=(IMsg)Class.forName(cname).newInstance();
		obj.process("Hello World!");
		
	}

}
