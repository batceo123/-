/**
 * 
 */
package cn.hhh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 海小飞
 *
 *测试Collections工具类的常用方法
 */
public class TestSort {
	public static void main(String[] args) {
		List<String> alList=new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			alList.add("a"+i);
				
		}
		System.out.println(alList);
		
		Collections.shuffle(alList); //对List容器内的元素进行随机排列
		System.out.println(alList);
		
		Collections.reverse(alList);//对List容器内的元素进行逆续排列
		System.out.println(alList);
		
		Collections.sort(alList);//排序
		System.out.println(alList);
		
		System.out.println(Collections.binarySearch(alList, "a2"));//对于顺序的List容器，采用折半查找的方法查找特定对象
		
		Collections.fill(alList, "hello");//用一个特定的对象重写整个List容器
		System.out.println(alList);	
	}

}
