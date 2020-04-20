/**
 * 
 */
package cn.hhh;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author 海小飞
 *
 *测试HashSet的用法
 */
public class TestHashSet {
	public static void main(String[] args) {
		
	
	User u1 = new User(5, "高淇", 18);
    User u2 = new User(2, "高希希", 5);
    Set<User> set = new TreeSet<User>();
    set.add(u1);
    set.add(u2);
    
    System.out.println(set);
}
}

class User implements Comparable<User> {
int id;
String uname;
int age;

public User(int id, String uname, int age) {
    this.id = id;
    this.uname = uname;
    this.age = age;
}



@Override
public String toString() {
	return "User [id=" + id + ", uname=" + uname + ", age=" + age + "]";
}


/**
 * 返回0 表示 this == obj 返回正数表示 this > obj 返回负数表示 this < obj
 */
@Override
public int compareTo(User o) {
    if (this.id > o.id) {
        return 1;
    } else if (this.id < o.id) {
        return -1;
    } else {
        return 0;
    }
}
}
		

	


