package test;

import java.util.Arrays;

/**
 * 测试二分法查找（折半查找）
 * @author 海小飞
 *
 */
public class TestBinarySearch {

	public static void main(String[] args) {
		
		int[] arr = { 30,20,50,10,80,9,7,12,100,40,8};
		Arrays.sort(arr);
		
		int value = 10;   //要查找的值
		System.out.println(Arrays.toString(arr));
		System.out.println(MyBinarySearch(arr, 40));
	}	
	
	public	static int MyBinarySearch(int[] arr,int value) {
		int low = 0;
		int high = arr.length - 1;
		//二分法算法
		while (low<=high) {
			int mid = (low+high)/2;
			if(value == arr[mid]) {
				return mid;
			}
			if(value > arr[mid]){
                low = mid + 1;
            }
            if(value < arr[mid]){
                high = mid - 1;
            }
		}
		return -1;     //上面循环完毕，说明未找到，返回-1

		
	}
	}


