package day11_29;

import java.util.Arrays;

/*
 * ð�����򣺾����㷨
 * ���󣺰�һ�����������������С��������
 */
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 56, 13, 88, 45, 6, 21, 52, 66, 552, 5, 21, 456, 56546, 525, 63, 1, 56 };
		System.out.println("�����鳤��Ϊ��" + arr1.length);
		System.out.println("����ǰ����Ϊ��");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " , ");
		}
		// ��1��ʵ�ַ�ʽ��
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
		// ��2��ʵ�ַ�ʽ��
		for (int i = 0; i < arr1.length - 1; i++) { // �����ִ�
			for (int j = 0; j < arr1.length - 1 - i; j++) { // ���ƴ�
				if (arr1[j] >= arr1[j + 1]) {
					int N = 0;
					N = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = N;
				}

			}

		}
		// ��3��ʵ�ַ�ʽ��Arrays.sort(arr1);

		Arrays.sort(arr1);
		System.out.println();
		System.out.println("�������������Ϊ��");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " , ");
		}
	}
}
