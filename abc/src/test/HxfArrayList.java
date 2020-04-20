package test;

import java.util.ArrayList;

/**
 * 自定义实现一个ArrayList,体会底层原理
 * 增加数组扩容
 * 增加泛型
 * @author 海小飞
 *
 */
public class HxfArrayList<E>{
	private Object[] elementData;
	private int size;
	
	public static final int DEFALT_CATACITY = 10;
	
	public  HxfArrayList() {
		elementData = new Object[DEFALT_CATACITY];	
	}
	
	public  HxfArrayList(int capacity) {
		elementData = new Object[capacity];	
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> s1 = new ArrayList<>(20);
		s1.add("aa");
		s1.add("bb");
		
		System.out.println(s1);
		
	}
	
	public void add(E e) {
		
		//什么时候扩容
		if (size == elementData.length) {
			//怎么扩容
			Object[] newArray = new Object[elementData.length+(elementData.length>>1)];  //箭头向右，右移一位
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData = newArray;
			
		}
		
		elementData[size++]= e;
		
	}

	

	

}
