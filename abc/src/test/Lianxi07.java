package test;

public class Lianxi07 {
	private int id;
	private int age;
	private String name;
	private boolean man;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getNamre(String name) {
		return this.name;
	}
	public void setAge(int age) {
		if(age>=1&&age<=130) {
			this.age=age;
		}else {
		System.out.print("请输入正确的年龄!");
	}
	} 
	
	public int  getAge() {
		return this.age=age;
	}
	
	
	
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id 要设置的 id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return man
	 */
	public boolean isMan() {
		return man;
	}

	/**
	 * @param man 要设置的 man
	 */
	public void setMan(boolean man) {
		this.man = man;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Lianxi07 lx = new Lianxi07();
		lx.setAge(67);
		System.out.println("年龄是:"+lx.age);
		

	}
	

}

