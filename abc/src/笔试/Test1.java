/**
 * 
 */
package 笔试;

/**
 * @author 海小飞
 * 编写函数，获取两段字符串的最长公共子串的长度，
 * 例如：S1= GCCCTAGCCAGDE ，S2= GCGCCAGTGDE，这两个序列的最长公共子串是GCCAG。
 *
 */
public class Test1 {
	
	public static void main(String[] args) {
		String s1="GCCCTAGCCAGDE";
		String s2="GCGCCAGTGDE";
		System.out.println(findMaxSame(s1,s2));
	}

	
	private static String findMaxSame(String s1, String s2) {
		int a=s1.length();
		String maxSame="";
		String subString="";
		
		for (int i = 0; i < a; i++) {
			for (int j = i+1; j < a; j++) {
				subString=s1.substring(i,j);
				if (s2.indexOf(subString)>=0) {
					maxSame=subString.length()>maxSame.length()?subString:maxSame;
				}else {
					break;
				}
				}
				
			}
			
		
		
		return maxSame;
	}

}
