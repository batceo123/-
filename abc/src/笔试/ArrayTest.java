package 笔试;

import java.util.Random;

public class ArrayTest {
		public static int minNumberInRotateArray(int [] array) {
			int a=array.length;
			if (a==0) {
				return 0;
			}
			if (a==1) {
				return array[0];
			}
			for (int i=0;array[i]>array[i+1];i++) {
				return array[i+1];
			}
			return array[0];
		}
		
		public static void main(String[] args) {
			Random ran =new Random();
			int array[]= new int[5];
			for (int i = 0; i < array.length; i++) {
				array[i]=ran.nextInt(10);
				System.out.print(array[i]);
				
			}
			System.out.println("\n"+ArrayTest.minNumberInRotateArray(array));
		}
}
