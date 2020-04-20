/**
 * 
 */
package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可视化日历程序
 * @author 海小飞
 *
 */
public class Rili {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws ParseException {
		//String string = "2019-8-17";
		
		System.out.println("请输入日期（格式为：2010-3-3）：");
		Scanner scanner = new Scanner(System.in);
        String dateString = scanner.nextLine(); // 2010-3-1
        
        System.out.println("您刚刚输入的日期是：" + dateString);
        //String string = dateString.split("-");
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse(dateString);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		
			
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int days = calendar.getActualMaximum(Calendar.DATE);
		
		System.out.println("日\t一\t二\t三\t四\t五\t六\t");
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		
		for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
			System.out.print("\t");
			
		}
	
		for (int i = 1; i <= days; i++) {
			
			if (day == calendar.get(Calendar.DAY_OF_MONTH)) {
				System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+"*\t");		
			}
			else {
				System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+"\t");
			}
			
			if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				System.out.println();  //如果是周六，就换行
				
			}
			calendar.add(Calendar.DAY_OF_MONTH, 1);
			
		}

	}

	
	}

	


