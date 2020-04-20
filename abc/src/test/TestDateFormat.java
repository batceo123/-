/**
 * 
 */
package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试时间对象和字符串之间的转换
 * DateFormat和SimpleDateFormat实现类的使用
 * @author 海小飞
 *
 */
public class TestDateFormat {
	
	public static void main(String[] args) throws ParseException {
		
		//把时间对象转为字符串
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String string = df.format(4000);
			System.out.println(string);
			
		DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
		
			Date date = df2.parse("2019年08月17日 09时53分45秒");
			System.out.println(date);
		
		}
		
		
		}

	


