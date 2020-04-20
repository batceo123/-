/**
 * 
 */
package test;
import java.util.Random;

/**
 * 测试冒泡排序以及优化
 * @author 海小飞
 *
 */
public class TestBubbleSort {
	
 
    // 对 bubbleSort 的优化算法
    public void bubbleSort(int[] list) {
        int temp = 0; // 用来交换的临时数
        boolean flag = false; // 交换标志
 
        // 要遍历的次数
        for (int i = 0; i < list.length - 1; i++) {
            flag = false;
            for (int j = 0; j <list.length-i-1; j++) {
                // 比较相邻的元素，如果前面的数大于后面的数，则交换
                if (list[j] > list[j+1]) {
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    flag = true;
                }
            }
 
            // 如果标志为false，说明本轮遍历没有交换，已经是有序数列，可以结束排序
            if (false == flag)
                break;
 
            System.out.format("第 %d 趟：\t", i);
            printAll(list);
        }
    }
 
    // 打印完整序列
    public void printAll(int[] list) {
        for (int value : list) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        // 初始化一个随机序列
        final int MAX_SIZE = 10;
        int[] array = new int[MAX_SIZE];
        Random random = new Random();
        for (int i = 0; i < MAX_SIZE; i++) {
            array[i] = random.nextInt(MAX_SIZE);
        }
 
        // 调用冒泡排序方法
        TestBubbleSort bubble = new TestBubbleSort();
        System.out.print("排序前:\t");
        bubble.printAll(array);
        bubble.bubbleSort(array);
        System.out.print("排序后:\t");
        bubble.printAll(array);
    }

		
	}


 

	