package test;
import java.util.Scanner;
public class Lianxi04 {
	/**
	 * @author 海小飞
	 *输入任意个字符串，将其中的小写字母变为大写，大写字母变为小写，其他字符不用处理；
	 *华为2018提前批笔试题编程题
	 */
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);	
			System.out.println("输入:");
			String str1 = sc.nextLine();
			System.out.println("输出:"+changeStr(str1));		
		}
		public static String changeStr(String str){  
	        str.toUpperCase();  
	        char[] ch = str.toCharArray();          
	        int a = 'A'-'a';   //获得大小写之间差值  
	        for(int i = 0; i < ch.length; i++){  
	            if('a' <= ch[i] && ch[i] <= 'z'){  
	                ch[i] = (char)(ch[i]+a);  
	            }else if('A' <= ch[i] && ch[i] <= 'Z'){  
	                ch[i] = (char)(ch[i]-a);  
	            }           
	        }  
	          String s=new String(ch);
	        return s;  
	    }  
	}
	
