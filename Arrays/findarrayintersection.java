package Arrays;

import java.util.ArrayList;

public class findarrayintersection {
	
//2 array mey jo jo common honge usko print karna hai
	//condition is that arrays are in ascending order
	public static void main(String[] args) {
		int a[]= {1,2,3,4,4,5};
		int b[]= {2,4,4};
//		ArrayList<Integer> ans=new ArrayList<>();
//		
//		for(int i=0;i<a.length;i++) {
//			int element=a[i];
//			for(int j=0;j<b.length;j++) {
//				if(element==b[j]) {
//					ans.add(element);
//					b[j]=Integer.MIN_VALUE; //important
//				}
//			}
//		}
//		for(int x:ans) {
//			System.out.println(x);
//		}

		
		
		//////////two pointer approach 
		int i=0,j=0;
		ArrayList<Integer> ans=new ArrayList<>();
		while(i<a.length && j<b.length) {
			if(a[i]>b[j]) {
				j++;
			}
			else if(a[i]==b[j]) {
				ans.add(a[i]);
				i++;
				j++;
			}else {
				i++;
			}
		}
		for(int x:ans) {
		System.out.println(x);
	}
	}
	

}
