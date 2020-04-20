package test;

/**
 * 自定义一个链表
 * @author 海小飞
 *
 */
public class HxfLinkedList01 {
	
	private Node first;
	private Node last;
	private int size;
	
	
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
		HxfLinkedList01 list = new HxfLinkedList01();
		
		list.add("a");
		list.add("b");
		list.add("c");
		
		System.out.println(list.toString());
		
	}

}
