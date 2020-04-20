package test;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author 海小飞
 *
 *测试TreeMap的使用
 */
public class TestTreeMap{
		public static void main(String args[]) {
	Map<Integer,String> treemap1=new TreeMap<>();
	treemap1.put(20, "aa");
	treemap1.put(3, "bb");
	treemap1.put(6, "cc");
	//按照key递增的方式排序
	for (Integer key:treemap1.keySet()) {
		System.out.println(key+"---"+treemap1.get(key));
		
	}
	
	Map<Emp, String> treemap2=new TreeMap<>();
	treemap2.put(new Emp(100, "张三", 50000), "张三是个好小伙");
	treemap2.put(new Emp(200, "李四", 6000), "李四工作不积极");
	treemap2.put(new Emp(300, "王五", 7000), "王五工作还不错");
	
	for (Emp key:treemap2.keySet()) {
		System.out.println(key+"---"+treemap2.get(key));
		
	}
}	
}
class Emp implements Comparable<Emp>{
	int id;
	String name;
	double salary;
	
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}



	@Override
	public int compareTo(Emp o) {//负数对应小于。0等于。正数大于
		
		if (this.salary>o.salary) {
			return 1;
		}else if(this.salary>o.salary){
			return -1;
		}else {
			if (this.id>o.id) {
				return 1;
			}else if (this.id<o.id) {
				return -1;
			}else {
				return 0;
			}
		}
	}
	
	
}
	
	
	

		

	
	



	
	
	  