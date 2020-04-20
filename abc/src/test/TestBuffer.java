/**
 * 
 */
package test;

/**
 * @author 海小飞
 *
 */
public class TestBuffer {

	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i= 0;i<26;i++) {
			char temp = (char )('a'+i);
			sb.append(temp);   //追加字符
		}
		System.out.println(sb);
		
		sb.reverse();          //倒序字符
		System.out.println(sb);
		
		sb.deleteCharAt(3);  //删除字符
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("中华人民共和国");
        sb2.insert(0, "爱").insert(0, "我");//插入字符串
        System.out.println(sb2);

	}

}
