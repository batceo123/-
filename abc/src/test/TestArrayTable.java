package test;

import java.util.Arrays;

/**
 * 测试二维数组存贮表格数据
 * @author 海小飞
 *
 */
public class TestArrayTable {

	public static void main(String[] args) {
		
		Object[] emp0 = {1,"海小飞",18,"程序员",2019};
		Object[] emp1 = {2,"海二飞",19,"教师",2029};
		Object[] emp2 = {3,"海三飞",22,"CEO",2039};
		
		Object[][] tableDate = new Object[3][];
		tableDate[0] = emp0;
		tableDate[1] = emp1;
		tableDate[2] = emp2;
		
		for(Object[] temp:tableDate) {
			System.out.println(Arrays.toString(temp));
		}

	}

}
