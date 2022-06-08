package step01_syntax;

import java.util.Arrays;

public class Ex06Reference {
	public static void main(String[] args) {
//		// 참조타입 step01_syntax 98Line
//		// 문자열(String)
//		// ==,equals
//
//		String str1 = "Java";
//		System.out.println(str1);
//		System.out.println(str1.hashCode());
//		str1 = null;
//		// System.out.println(str1.hashCode());
//
//		// 배열(Array) step01_syntax 103Line
//		int[] arr1 = { 1, 2, 3 };
//		String[] arr2 = { "one", "two", "three" };
//		int[] arr3;
//		arr3 = new int[] { 4, 5, 6 };
////		for (int i =0; i<=arr1.length -1;i++) {
////			System.out.println(arr2[i]);
////		}
////		
//		for (String i : arr2) {
//			System.out.println(i);
//		}
//		// 얕은 복사
//		int[] arr5 = { 3, 2, 1 };
//		int[] arr6 = arr5;
//		// ---------------
//		System.out.println("-----arr6");
//		for (int i : arr6) {
//			System.out.println(i);
//		}
//		Arrays.sort(arr5);
//		System.out.println("-----arr5");
//		for (int i : arr5) {
//			System.out.println(i);
//		}
//		System.out.println("-----arr6");
//		for (int i : arr6) {
//			System.out.println(i);
//		}
//
//		// 깊은복사
//		int[] arr7 = { 1, 2, 3 };
//		int[] arr8 = new int[arr7.length];
//		for (int i = 0; i < arr7.length; i++) {
//			arr8[i] = arr7[i];
//		}
//		System.out.println("------결과값");
//		System.out.println(arr7); // 주소값 : I@15db9742
//		System.out.println(arr8); // 주소값 : I@6d06d69c >> 다른 주소값을 가짐
//		arr8[2] = 5;
//		System.out.println(arr8[2]);
//		System.out.println(arr7[2]);
//		// 깊은복사2
//		int[] arr9 = arr7.clone();
//
//		// 깊은복사3
//		int[] arr10 = Arrays.copyOf(arr7, arr7.length);
//
//		int[][] arr = new int[8][9];
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = (i + 2) * (j + 1);
//			}
//			System.out.println(i + 2 + "단 : " + Arrays.toString(arr[i]));
//
//			
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				arr1[j - 1] = i * j;
			}
			System.out.println(i + "단: " + Arrays.toString(arr1));
		}
	}
}
