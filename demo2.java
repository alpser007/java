package day11_29;
import java.util.Arrays;

/*
 * �㷨
 * ���󣺲���һ������Ϊ1000�����飬ð��������ʱ��Arrays.sort������ʱ
 * 
 */

public class demo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = new int[10000];
		
		//���������渳���ֵ
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 100);
		}
		
		//��ȡ��ǰϵͳʱ��
		long l1 = System.currentTimeMillis();
		
		//��ð�ݷ�����
		for (int i = 0; i < arr1.length - 1; i++) {
			for (int j = 0; j < arr1.length - 1 - i; j++) {
				int m = arr1[j];
				arr1[j] = arr1[j + 1];
				arr1[j + 1] = m;
			}
		}
		
        //ϵͳ���ð����������ʱ��
		System.out.println("ð��������ʱ��" + (System.currentTimeMillis() - l1) + "����");
		
		//��ȡ��ǰϵͳʱ��
		long l2 = System.currentTimeMillis();
		Arrays.sort(arr1);
		
		//ϵͳ���ð����������ʱ��
		System.out.println("Arrays.sort��ʱ��" + (System.currentTimeMillis() - l2) + "����");
	}
}
