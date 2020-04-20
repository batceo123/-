package test;

import java.util.Scanner;

/**
 * 已知二叉树前序遍历和中序遍历，求后序遍历
 * @author 海小飞
 *
 */
public class Main0 {
	static int index = 0;		//全局变量，用于遍历before序列
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("输入");
	     String before = sc.nextLine();
	     String middle = sc.nextLine();
	     System.out.println("输出");
		
		Main0 main = new Main0();
		main.getAfter(before, middle);
	}
 
	public void getAfter(String before, String middle){
		if(middle.length() == 0){				//递归终止条件，叶子节点
			return ;
		}
	
		//index每次递归加1，用以获取before序列中的下一个根字符
		char root = before.charAt(index++);
		//获取根在中序遍历中出现的位置，以此切割中序遍历的字符串
		int i = middle.indexOf(root);			
		
		//切分middle字符串，得到left和right两部分
		String left = middle.substring(0, i);
		String right = middle.substring(i+1);
		
		getAfter(before, left);			//递归处理左子树
		getAfter(before, right);		//递归处理右子树
		//输出后序序列
		System.out.print(root);		
	}
}