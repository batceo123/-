/**
 * 
 */
package test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * 测试文件类的用法file
 * @author 海小飞
 *
 */
public class TestFile {

	public static void main(String[] args) throws IOException {
		
		File file = new File("d:/Android.txt");//或者可以使用反斜杠\\
		System.out.println(file);
		file.renameTo(new File("d:\\android.txt"));
		
		System.out.println(System.getProperty("user.dir"));
		
		File file2 = new File("a.txt");   //相对路径：默认放到user.dir目录下面
		file2.createNewFile();
		
		File file3 = new File("d:/b.txt");   //绝对路径：指定为哪里就放在哪个文件夹下面
		file3.createNewFile();
		
		System.out.println("File是否存在："+file.exists());
        System.out.println("File是否是目录："+file.isDirectory());
        System.out.println("File是否是文件："+file.isFile());
        System.out.println("File最后修改时间："+new Date(file.lastModified()));
        System.out.println("File的大小："+file.length());
        System.out.println("File的文件名："+file.getName());
        System.out.println("File的相对目录路径："+file2.getPath());
        System.out.println("File的绝对目录路径："+file2.getAbsolutePath());
        
        
        File file4 = new File("d:/电影");
        boolean flag = file4.mkdir();
        System.out.println(flag);   //mkdirs()；创建一个目录树(创建多个目录)
	}

}
