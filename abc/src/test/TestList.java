/**
 * 
 */
package test;
import java.util.*;;
/**
 * 测试collection接口中的方法
 * @author 海小飞
 *
 */
public class TestList {

	public static void main(String[] args) {
		test03();

	}

public static void test01(){

	Collection<String> c = new ArrayList<>();
	System.out.println(c.size());
	System.out.println(c.isEmpty());
	
	c.add("海小飞");
	c.add("海二飞");
	
	System.out.println(c.contains("海小飞"));
	
	Object[] obj = c.toArray();
	System.out.println(obj);
	
	System.out.println(c);
	
	c.remove("海小飞");
   System.out.println(c);  
   
     // c.clear();  移除所有数据
   }



      public static void test02() {
    	  
    	  List<String> list01 = new ArrayList<>();
		
    	  list01.add("aa");
    	  list01.add("bb");
    	  list01.add("cc");
    	  
    	  List<String> list02 = new ArrayList<>();
    	  list02.add("aa");
    	  list02.add("dd");
    	  list02.add("ee");
    	  
    	  System.out.println("list01:"+list01);
    	  
    	  list01.addAll(list02);  //将list02的数据加入list01中
    	 // list01.removeAll(list02);   //删除list02和list02中相同的数据
    	  //list01.retainAll(list02);   //取出list01和list02中的交集
    	  System.out.println("list01:"+list01);
    	  
    	  System.out.println(list02.containsAll(list01));  //1是否全部包含2的内容
	}

      
      public static void test03() {
    	  //测试跟索引相关的方法
    	  List<String> list = new ArrayList<>();
    	  
    	  list.add("A");
    	  list.add("B");
    	  list.add("C");
    	  list.add("D");
    	  
    	  
    	  list.add(2,"开心");
    	  System.out.println(list);
    	  
    	  list.remove(2);
    	  System.out.println(list);
    	  
    	  list.set(2, "开心");
    	  System.out.println(list); 
    	  System.out.println(list.get(2)); 
    	  
    	  list.add("C");
    	  list.add("B");
    	  list.add("A");
    	  System.out.println(list);
    	  System.out.println(list.indexOf("B"));
    	  System.out.println(list.lastIndexOf("B"));
    	 
	}

}