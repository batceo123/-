package 笔试;

import java.util.Scanner;

/**
 * @author 海小飞
 * 
 *
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class Solution {
	public int minNumberInRotateArray(int []array) {
		
		if (array==null||array.length==0) {
			return 0;
		}
		int left=0;
		int right=array.length-1;
		
		if (left<0||right>array.length-1) {
			return 0;
		}
		
		while (left<right) {
			int mid=(left+right)/2;
			if (array[mid]>array[right]) {
				left=mid+1;
			}else if (array[mid]==array[right]) {
				right=right-1;
			}else {
				right=mid;
			}
		}
		
		return array[right];
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int array[]= new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
			System.out.print(array[i]);
			
		}
		System.out.println("\n"+ArrayTest.minNumberInRotateArray(array));
	}
		
}   