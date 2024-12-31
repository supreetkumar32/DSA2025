package array;

import java.util.ArrayList;

public class sumOfArrays {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		int b[]= {3,6};
		ArrayList<Integer> al=new ArrayList<>();
		int i=a.length-1;
		int j=b.length-1;
		int carry=0;
		int sum=0;
		while(i>=0 && j>=0) {
			int val1=a[i];
			int val2=b[j];
			 sum=val1+val2+carry;
			 carry=sum/10;
			 sum=sum%10;
			 al.add(sum);
			 i--;
			 j--;
		}
		//first case: when a has elements left
		while(i>=0) {
			 sum=a[i]+carry;
			 carry=sum/10;
			 sum=sum%10;
			 al.add(sum);
			 i--;
		}
		
		//second case: when elements left in second array
		while(j>=0) {
			 sum=a[j]+carry;
			 carry=sum/10;
			 sum=sum%10;
			 al.add(sum);
			 j--;
		}
		
		while(carry!=0) {
			sum=carry;
			carry=sum/10;
			 sum=sum%10;
			 al.add(sum);
		}
		
		for(int x:al) { //it will print in the reverse order....
			System.out.println(x);
		}
		
	}
	

}
