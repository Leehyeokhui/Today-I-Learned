package com.encore.inter;

public class ArrCopyTest {
	public static void printArr(int[] arr) {
		for(int i : arr) {
			System.out.println(i + "\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] b = arr; //얕은 복사
		b[2] = 300;
		printArr(arr); //b에서 바꿧지만 arr에 영향
		b[2] = 3;
		
		int[] c = new int[arr.length]; //깊은 복사
		int cnt = 0;
		for(int i : arr) {
			c[cnt++] = i;
		}
		printArr(c);
		
		c[2] = 300;
		printArr(c);
		printArr(arr); //c만 바뀌고 arr에는 영향 없음
		
		int[] dest = new int[5];
		//System.arraycopy(원본배열, 원본배열 복사위치, 복사배열, 복사배열 복사위치, 복사할개수);
		System.arraycopy(arr, 0, dest, 0, 5);
		printArr(dest);
		dest[1] = 500;
		printArr(dest);
		printArr(arr);
	}
}
