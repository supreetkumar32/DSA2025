package array;

import java.util.ArrayList;
import java.util.HashSet;

public class subarraywithsum0 {
	
	public static void main(String[] args) {
		
		int a[]= {4,2,-3,1,6};
		int flag=0;
		HashSet<Integer> hs=new HashSet<>();
		int sum=0;
		for(int i=0;i<a.length;i++) {
			hs.add(sum);
			sum=sum+a[i];
			if(hs.contains(sum)) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("Subarray with 0 sum is present");
		}else {
			System.out.println("Subarray with 0 sum is not present");
		}

	}
	

}
