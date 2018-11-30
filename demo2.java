package day11_29;
import java.util.Arrays;

/*
 * 算法
 * 需求：测试一个长度为1000的数组，冒泡排序用时和Arrays.sort排序用时
 * 
 */

public class demo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = new int[10000];
		
		//给数组里面赋随机值
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 100);
		}
		
		//获取当前系统时间
		long l1 = System.currentTimeMillis();
		
		//用冒泡法排序
		for (int i = 0; i < arr1.length - 1; i++) {
			for (int j = 0; j < arr1.length - 1 - i; j++) {
				int m = arr1[j];
				arr1[j] = arr1[j + 1];
				arr1[j + 1] = m;
			}
		}
		
        //系统输出冒泡排序所用时间
		System.out.println("冒泡排序用时：" + (System.currentTimeMillis() - l1) + "毫秒");
		
		//获取当前系统时间
		long l2 = System.currentTimeMillis();
		Arrays.sort(arr1);
		
		//系统输出冒泡排序所用时间
		System.out.println("Arrays.sort用时：" + (System.currentTimeMillis() - l2) + "毫秒");
	}
}
