/**
 * 
 */
package com.hxf.niuke;

import java.util.Random;

/**
 * 使用random() 函数，生成 10个随机数，并对它进行降序排序 【携程测试编程题】
 * @author 海小飞
 *
 */
public class Main {
	private static int temp;

	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] a = new int[10];//定义数组并指定大小
		int n = a.length;
		for (int i = 0; i < n; i++) {
			a[i] = rand.nextInt(10);//随机生成10个10以内的数
			System.out.print(a[i]);
		}
		
		//将数组a冒泡降序排列
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
					if(a[j]<a[j+1])
					            {
					                temp=a[j];
					                a[j]=a[j+1];
					                a[j+1]=temp;
					            }
			}	
		}
		
		System.out.println();//打印一个换行
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]);
			
		}
	
		
	}

}
