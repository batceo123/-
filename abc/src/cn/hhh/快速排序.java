/**
 * 
 */
package cn.hhh;

/**
 * @author 海小飞
 *
 */
public class 快速排序 {
	//快速排序算法
	public static void main(String[] args) {
		int[] a= {0,8,9,7,6,4,3,5,1,2};
		quickSort(a, 0, a.length-1);
		
		for ( int i = 0; i < a.length; i++) {
			System.out.printf("%d",a[i]);
		}
		
	}

	 static void quickSort(int[] a,int low,int high) {
		 int p;   //划分后的基准记录的位置
		if (low<high) {  //仅当区间长度大于1时才需排序
		    p=partition(a,low,high);  //对a[low,,,high]做划分
			quickSort(a, low, p-1);   //对左区间递归排序
			quickSort(a, p+1, high);  //对右区间递归排序
			
		}
		
		
	}

	//划分算法
	 static int partition(int[] a, int low, int high) {
		int pivot=a[low];
		int p=low;
		for (int r = low+1; r <= high; r++) {
			
			if (pivot<0) {
				a[p]=a[r];
				a[r]=a[++p];
			}
			a[p]=pivot;
			return p;
		}return p;
	}

}
