package day11_29;

import java.util.Arrays;

/*
 * 冒泡排序：经典算法
 * 需求：把一个数组里面的整数从小到大排序
 */
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 56, 13, 88, 45, 6, 21, 52, 66, 552, 5, 21, 456, 56546, 525, 63, 1, 56 };
		System.out.println("该数组长度为：" + arr1.length);
		System.out.println("排序前数组为：");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " , ");
		}
		// 第1种实现方式：
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {

				if (arr1[i] < arr1[j]) {
					int N = 0;
					N = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = N;
				}
			}
		}
		// 第2种实现方式：
		for (int i = 0; i < arr1.length - 1; i++) { // 控制轮次
			for (int j = 0; j < arr1.length - 1 - i; j++) { // 控制次
				if (arr1[j] >= arr1[j + 1]) {
					int N = 0;
					N = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = N;
				}

			}

		}
		// 第3种实现方式：Arrays.sort(arr1);

		Arrays.sort(arr1);
		System.out.println();
		System.out.println("经过排序后数组为：");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " , ");
		}
	}
}
