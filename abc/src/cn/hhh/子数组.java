/**
 * 
 */
package cn.hhh;

import java.util.Scanner;

/**
 * @author 海小飞
 *输入一个整形数组（可能有正数和负数），
 *求数组中连续子数组（最少有一个元素）的最大和。要求时间复杂度为O(n)。
 */
public class 子数组 {
	static Scanner sc = new Scanner(System.in);
	static int N=sc.nextInt();  //用户输入的数字
	static int b[]=new int[N];   //数组的长度为N，由用户输入
	public static void main(String[] args) {
		
		
		for(int i = 0; i < b.length; i++){
			b[i] = sc.nextInt();
			}
		
		System.out.println(findMax());
	}
	
	public static int findMax() {

	    int maxSum = b[0],currSum = b[0];
	    
	    for(int i = 1; i < b.length; i++){
	        if(currSum < 0){
	            currSum = b[i];
	        }else{
	            currSum += b[i];
	        }
	        if(currSum > maxSum){
	            maxSum = currSum;
	        }
	    }
	    return maxSum;
	}
	} 
	
	    



