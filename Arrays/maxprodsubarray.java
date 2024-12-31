package array;

import java.util.ArrayList;
import java.util.HashSet;

public class maxprodsubarray {
	
	public static void main(String[] args) {
		
		int a[]= {4,0,2,-1,0,-3,-2,0,1,-2,6,-7};
		int ans=Integer.MIN_VALUE;
		int prod=1;
		for(int i=0;i<a.length;i++) {
			prod=prod*a[i];
			ans=Math.max(ans, prod);
			if(prod==0) {
				prod=1;
			}
		}
		System.out.println(ans);

	}
	

}
