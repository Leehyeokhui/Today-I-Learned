package com.encore.inter;

import java.util.Arrays;

interface MinMax{//배열 최대 최소 구함
	int arrMin(int[] arr);
	int arrMax(int[] arr);
}

interface Sort{//배열 정렬
	void bubbleSort(int[] arr);
	int[] bubbleSort2(int[] arr);
	void insertSort(int[] arr);
	void selectSort(int[] arr);
	void printArr(int[] arr);
}

interface Search{
	int 순차탐색(int[] arr, int num);
	int 이진탐색(int[] arr, int num);
}

//인터페이스 상속 키워드는 implements, 다중상속 가능, 콤마로 상속받을 인터페이스를 나열
class WorkArr implements MinMax, Sort, Search{

	@Override
	public void bubbleSort(int[] arr) {
		int i, j, tmp;
		for(i = 0; i < arr.length-1; i++) {
			for(j =0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}

	@Override
	public void insertSort(int[] arr) {
		int tmp;
		for(int i = 1; i<arr.length;i++) {
			for(int j = i; j > 0; j--) {
				if(arr[j-1] > arr[j]) {
					tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	@Override
	public void selectSort(int[] arr) {
		int tmp; 
		for(int i = 0; i < arr.length-1; i++) {
			int min = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
		tmp = arr[min];
		arr[min] = arr[i];
		arr[i] = tmp;
		}
	}

	@Override
	public int arrMin(int[] arr) {
		int min = arr[0];
		for(int a : arr) {
			if(a < min) min = a;
		}
		return min;
	}

	@Override
	public int arrMax(int[] arr) {
		int max = arr[0];
		for(int a : arr) {
			if(a > max) max = a;
		}
		return max;
	}

	@Override
	public int 순차탐색(int[] arr, int num) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) return i;
		} 
		return -1;	
	}

	@Override
	public int 이진탐색(int[] arr, int num) {
		Arrays.sort(arr);
		int first = 0;
		int last = arr.length-1;
		int mid;
		while(first <= last) {
			mid = (first + last)/2;
			if(arr[mid] > num) {
				last = mid-1;
			}else if(arr[mid] < num) {
				first = mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}

	@Override
	public void printArr(int[] arr) {
		for(int a : arr) {
			System.out.println(a + "\t");
		}
		System.out.println();
	}

	@Override
	public int[] bubbleSort2(int[] arr) {
		int i, j, tmp;
		int[] r = new int[arr.length];
		System.arraycopy(r, 0, r, 0, r.length);
		bubbleSort(r);
		return r; //배열의 주소값 반환
	}
}

public class Test1Main {

	public static void main(String[] args) {
		WorkArr wa = new WorkArr();
		int[] a = {7,4,2,6,9,1,8,3,5};
		wa.printArr(a);
		System.out.println("최대값 : " + wa.arrMax(a));
		System.out.println("최소값 : " + wa.arrMin(a));
		wa.bubbleSort(a);
		int[] res = wa.bubbleSort2(a);
		System.out.println("정렬 후");
		wa.printArr(a);
		wa.printArr(res);
		System.out.println("순차탐색");
		System.out.println(wa.순차탐색(a,4));
		System.out.println("이진탐색");
		System.out.println(wa.이진탐색(a, 6));
	}
}
