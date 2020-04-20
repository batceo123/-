/**
 * 
 */
package test;

import java.io.FileReader;
import java.io.IOException;

/**
 * 使用throws抛出异常
 * @author 海小飞
 *
 */
public class TestException2 {
	public static void main(String[] args) throws IOException {
		readMyFile();
	}
	@SuppressWarnings({ "null", "unused" })
	public static void readMyFile() throws IOException {    //使用静态方法进行封装
		FileReader fReader = null;
			//读取文件信息
			@SuppressWarnings("resource")
			FileReader fReader1 = new FileReader("d:/b.txt");
			char c1 = (char)fReader1.read();
			System.out.println(c1);
				if (fReader != null) {
					fReader.close();
				}
	}	
	}


