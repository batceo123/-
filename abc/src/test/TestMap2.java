/**
 * 
 */
package test;

import java.util.HashMap;
import java.util.Map;

/**
 * 继续测试map的常用方法
 * @author 海小飞
 *
 */
public class TestMap2 {

	public static void main(String[] args) {
		Employee e1 =new Employee(1, "小飞", 3550.5);
		Employee e2 =new Employee(2, "小二", 3560.5);
		Employee e3 =new Employee(3, "小三", 8550.5);
		
		Map<Integer, Employee> m1 = new HashMap<>();
		
		m1.put(1, e1);
		m1.put(2, e2);
		m1.put(3, e3);
		
		Employee emp = m1.get(1);
		System.out.println(emp.getName());
		System.out.println(m1);

	}

}
//雇员信息
class Employee{
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public double getSalary() {
		return salary;
	}

	
	public void setSalary(double salary) {
		this.salary = salary;
	}


	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
