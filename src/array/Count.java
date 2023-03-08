package array;

public class Count {
	public static void main(String[] args) {
		int[] arr= {4,-4,6,8,-9,0,4,-7,56};
		int p=0;
		int n=0;
		for(int i=0;i<9;i++) {
			if(arr[i]<0) {
				n++;
			}
			else {
				p++;
				
			}
		}
		System.out.println(p);
	    System.out.println(n);

}
}
