package test;

import java.util.*;
/**
 * @author 海小飞
 *
 */
public class Main2{
    @SuppressWarnings("resource")
	public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        System.out.println(solution(st));//输入一个字符串
    }
    public static String solution(String s){
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);  //charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1
            if(Character.isDigit(c)) //isDigit() 方法用于判断指定字符是否为数字
                continue;
            else if(c=='$')
                sb.append('^');//^ 和 $ 分别用来匹配字符串的开始和结束
            else
                sb.append(c);
    /**
    * append方法的作用是在一个StringBuffer对象后面追加字符串。
    * 例如StringBuffer s = new StringBuffer("Hello");s.append("World");
    *则s的内容是HelloWorld。
    */

        }
        return sb.toString();
    }
     
}
