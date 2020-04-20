/**
 * 
 */
package test;

import java.util.Date;

/**
 * @author 海小飞
 *
 */
public class TestDate {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date data = new Date(2000) ;
		System.out.println(data);
		System.out.println(data.getDate());
		
		//以后遇到日期处理，使用Calendar类
		Date d3 = new Date(2019-1900, 8, 17 );
		System.out.println(d3);
	}
		
	

}
