package test;

import java.util.ArrayList;

public class Test3 {
	public static void main(String[] args) {
		
		ArrayList<Integer[]> arr =  new ArrayList<Integer[]>();
		
		arr.add( new Integer[]{ 11, 12, 13, 14 } );
		arr.add( new Integer[]{ 21, 22, 23, 24 } );
		arr.add( new Integer[]{ 31, 32, 33, 34 } );
		
		// Test3 전체 요소 출력하기
		/*
		 * 11 12 13 14 
		 * 21 22 23 24 
		 * 31 32 33 34 
		 */
		//version1
		for(Integer[] number : arr) {
			for(int x : number) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
		System.out.println();
		//version2
		arr.stream().forEach(num->{
			for(int number:num) 
			{System.out.print(number+" ");}
			System.out.println();
			}
		);
		System.out.println();
		//version3
		arr.forEach(numbers->{for(int num:numbers) {
			System.out.print(num+" ");}
		System.out.println();
		});
		
	}
}
