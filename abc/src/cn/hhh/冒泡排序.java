/**
 * 
 */
package cn.hhh;

/**
 * @author 海小飞
 *
 */
public class 冒泡排序 {
	
	private static int[] list= {0,8,9,7,6,4,3,5,1,2};

	public static void main(String[] args) {
		bubbleSort(list);
	}
	//冒泡排序算法
	private static void bubbleSort(int[] list) {
		int temp=0;//用于交换的临时变量
		boolean flag=false;
		
		for (int i = 0; i < list.length-1; i++) {//遍历次数
			flag=false;
			for (int j = 0; j < list.length-i-1; j++) {//第i趟遍历的比较
				//如果前面的大于后面的数字，则交换
				if (list[j]>list[j+1]) {
					//交换
					temp = list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
					flag=true;
				}
			}
			if (false==flag) {
				break;
			}
			
		}
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i]);
			
		}
	}
	

}
