public class EvenOdd {
	public static void main(String[] args) {
		int a[] = {1,3,5,7,11,12,15,16};
		int i = 0;
		while(i <a.length) {
			if(a[i]%2 ==0) {
				System.out.println(a[i]);
			}
			i++;
			}
		int j = 0;
		while(j <a.length) {
			if(a[j]%2 !=0) {
				System.out.println(a[j]);
			}
			j++;
			}
	}

}
