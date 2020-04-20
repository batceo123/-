/**
 * 
 */
package test;

import java.util.Arrays;

/**
 * 自定义一个hashMap
 * @author 海小飞
 *
 */
public class TastHashMap01 {
	Node2[] table;   //位桶数组
	int size;  // 存放键值对的个数
	
	public TastHashMap01() {
		
		table = new Node2[16];//长度一般定义为二的整数幂
			
	}
	public void put(Object key,Object value) {
		
		//定义了新的节点对象
		Node2 newNode = new Node2();
		newNode.hash = myHash(key.hashCode(), table.length);
		newNode.key = key;
		newNode.value = value;
		newNode.next = null;
		
		Node2 temp = table[newNode.hash];
		if (temp==null) {
			//此处节点为空，则直接将新节点放进去
			table[newNode.hash] = newNode;	
		}else {
			//此处元素不为空，则遍历对应链表
		}
		
	}
	public int  myHash(int v,int length) {
		
		System.out.println("hash in my Hash"+(v&(length-1)));//直接位行算，效率高
		System.out.println("hash in my Hash"+(v%(length-1)));
		return v&(length-1);
		
	}
	
	public static void main(String[] args) {
		TastHashMap01 m = new TastHashMap01();
		
		m.put(10, "aa");
		m.put(20, "bb");
		m.put(30, "cc");
		
		System.out.println(m.toString());
		
	}
	
	@Override
	public String toString() {
		return "TastHashMap01 [table=" + Arrays.toString(table) + ", size=" + size + "]";
	}
	
	
	
}
