package cn.hhh;


/**
 * @author 海小飞
 *
 *插入排序
 *时间复杂度: n²
 */
public class InsertionSort{
	public static void main(String[] args) {
		
		int i = 0;
		int array[]={9,3,4,2,6,7,5,1};
		
		/**
		 * InsertionSort sort = new InsertionSort();
		   sort.insertSort1(array);
		     不加static时先实例化对象，再用对象名.方法名调用
		   insertSort1方法加了static之后可以直接使用类名.方法名调用
		 */
		
		
		InsertionSort.insertSort1(array);
		for(i=0;i<8;i++)
		{
			System.out.print(array[i]);
		}
		
	}
	
	private static void insertSort1(int[] array) {
		int i,j,temp;
		for(i=1;i<array.length;i++) {
			/*
			 * 第一个for循环
			 * 把数组分成两部分，右边为未排序，左边为已排序
			 * 记录排序与未排序分割点temp（temp为下一个排序对象）
			 */
			temp=array[i];
			for(j=i-1;j>=0;j--) {
			/*
			 * 第二个for循环
			 * 将排序对象temp与已排序数组比较
			 * 当temp比最近左边的数大时（按从小到大循序排列时）
			 * 直接结束本次循环，进行下一个数排序
			 * 否则比左边这个数小时将这个数后移，腾出这个数的位置
			 */
			   if (temp > array[j]) {
					break;
			   }else{
		    	   array[j+1] = array[j];
		       }
			}
			array[j+1]=temp;
		}
		
	}
}
	
	
		