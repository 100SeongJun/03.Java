package step01_syntax;
public class Ex06Reference {
	public static void main(String[] args) {
		//	 참조타입 step01_syntax 98Line
		//문자열(String)
		//==,equals
		
		String str1 = "Java";
		System.out.println(str1);
		System.out.println(str1.hashCode());
		str1 = null;
		//System.out.println(str1.hashCode());
		
		//배열(Array) step01_syntax 103Line
		int[] arr1 = {1,2,3};
		String[] arr2 = {"one","two","three"};
		int[] arr3;
		arr3 = new int [] {4,5,6};
		for (int i =0; i<=arr1.length -1;i++) {
			System.out.println(arr2[i]);
		}
		
		
		
	}
	
}
