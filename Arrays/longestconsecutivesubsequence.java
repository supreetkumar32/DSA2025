package array;

import java.util.Arrays;
import java.util.HashSet;
//https://www.youtube.com/watch?v=oO5uLE7EUlM
public class longestconsecutivesubsequence {
	
	public static void main(String[] args) {
		
		int a[]= {5,8,3,2,1,4};
//		Arrays.sort(a);
//		int longest=1;
//		int prevSmall=Integer.MIN_VALUE;
//		int count=0;
//		for(int i=0;i<a.length;i++) {
//		     if(a[i]-1 ==prevSmall) {
//				count++;
//				prevSmall=a[i];				
//			}else if(prevSmall!=a[i]){
//					count=1;
//					prevSmall=a[i];
//				
//			}
//			longest=Math.max(longest,count );
//		}
//		
//	System.out.println(longest);
		
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		int ans=0;
		for(int i=0;i<a.length;i++) {
			if(!hs.contains(a[i]-1)) {//it will take us to the starting point of a particular subsequence
				int val=a[i];
				while(hs.contains(val)) val++;//Each element is only visited once in total across all iterations because
				//every number is part of exactly one sequence.
				ans=Math.max(ans, val-a[i]);
			}
		}
		System.out.println(ans);
		
	}
	

}
