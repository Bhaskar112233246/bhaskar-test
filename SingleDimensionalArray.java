public class SingleDimensionalArray {
	public static void main(String[] args) {
		int arr[] = {1,3,5,7,11,12,15,16};

		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
	}
}
}
