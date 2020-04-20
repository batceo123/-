/**
 * 
 */
package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * 测试异常，使用try catch finally语句处理异常
 * @author 海小飞
 *
 */
public class TestException {

	public static void main(String[] args) {
		readMyFile();
		
	}

public static void readMyFile() {    //使用静态方法进行封装
		FileReader fReader = null;
		try {
			@SuppressWarnings("resource")
			//读取文件信息
			FileReader fReader1 = new FileReader("d:/b.txt");
			
			char c1 = (char)fReader1.read();
			
			System.out.println(c1);
					
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			//子类异常在父类前面
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				
				if (fReader != null) {
					fReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
