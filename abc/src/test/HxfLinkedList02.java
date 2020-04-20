package test;


/**
 * 自定义一个链表
 * 增加get方法
 * @author 海小飞
 *
 */
public class HxfLinkedList02 {
	
	private Node first;
	private Node last;
	private int size;
	
	public Object get(int index) {
		
		if (index<0 || index>size-1) {
			throw new RuntimeException("索引数字不合法！"+index);
			
		}
		Node temp = null;
		
		if (index<=(size>>1)) {  //size>>1相当于除以2
			temp = first;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}	
		}else {
			temp = last;
			for (int i = size-1; i > index; i--) {
				temp = temp.previous;
			}
		}
		return temp.element;
		
	}
	
	public void add(Object obj) {
		Node node = new Node(obj);
		
		if (first == null) {
			
			//node.previous = null;
			//node.next = null;
			
			first = node;
			last = node;
		}else {
			
			node.previous = last;
			node.next = null;
			
			last.next = node;
			last = node;
				
		}
		size++;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder("[");
		
		Node temp = first;
		while (temp!=null) {
			sb.append(temp.element+",");
			temp = temp.next;
			
		}
			
	//挨个遍历列表中的元素	
		sb.setCharAt(sb.length()-1, ']');
		
		return sb.toString();
	}
	public static void main(String[] args) {
		HxfLinkedList02 list = new HxfLinkedList02();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		
		System.out.println(list.toString());
		System.out.println(list.get(3));
		
	}

}
