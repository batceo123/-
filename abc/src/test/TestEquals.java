package test;

public class TestEquals {
	public static void main(String[] args) {
		Object obj;
		String str;
		User user1 = new User(100, "云儿", "123");
		User user2 = new User(100, "小飞", "12345");
		User user3 = new User(100, "小飞", "12345");
		System.out.println(user1 == user2);
		System.out.println(user1.equals(user2));
		System.out.println(user2 == user3);
		
		
	}
}
class User{
	int id;
	String name;
	String pwd;
	
	public User(int id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}

	/* （非 Javadoc）
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	/* （非 Javadoc）
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
	
}