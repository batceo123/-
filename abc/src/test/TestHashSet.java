/**
 * 
 */
package test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 海小飞
 *
 */
public class TestHashSet {
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("hello");
        set.add("world");
        System.out.println(set);
        set.add("hello"); //相同的元素不会被加入
        System.out.println(set);
        set.add(null);
        System.out.println(set);
        set.add(null);
        System.out.println(set);

	}

}
