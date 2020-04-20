/**
 * 
 */
package com.hxf.niuke;

import java.util.Scanner;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 * @author 海小飞
 *
 *(二维数组的查找)
 */
public class Offer01 {
    //选择该二维数组的最右上角的那个数开始扫描，当target小于该值时，可以清除一列，当target大于该值时，可以清除一行
    public boolean Find(int target, int [][] array) {
        if (null == array) {
            return false;
        }
        int i = 0;//表示第一行
        int j = array[0].length;//表示该二维数组的列数
        int start;
        while (i < array.length && j > 0) {
            start = array[i][j-1];//每次清除一行或一列后的最右上角的元素
            if (target < start) {
                j--;
            } else if (target > start) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
    
    @SuppressWarnings("resource")
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int i =sc.nextInt();
		Offer01 Find = new Offer01();
		
		int [][] array = {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		
		System.out.println(Find.Find(i, array));
		
	}
}
