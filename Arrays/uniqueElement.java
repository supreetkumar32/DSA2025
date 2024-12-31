package array;

public class uniqueElement {
	
//	XOR
//	a^a=0
//	0^a=a
	public static void main(String[] args) {
		int a[]= {1,2,5,2,1};
		int ans=0;
		for(int i=0;i<a.length;i++) {
			ans=ans^a[i];
		}
		System.out.println(ans);
	}
	

}
