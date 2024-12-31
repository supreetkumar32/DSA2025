package array;
//kadanes algo
public class maxSubarraySum {
	
	public static void main(String[] args) {
		
		int a[]= {1,-2,3,-4,-1,-2,5,6};
		int max=Integer.MIN_VALUE;
		int sum=0;
		int start=0,ansStart=-1,ansEnd=-1;//for tracking
		for(int i=0;i<a.length;i++) {
			if(sum==0) start=i;//for tracking
			sum=sum+a[i];
			if(sum>max) {
				max=sum;
				ansStart=start;ansEnd=i;//for tracking
			}
			if(sum<0) {
				sum=0;
			}
		}
        System.out.println(max);
        System.out.println(ansStart);
        System.out.println(ansEnd);
	}
	

}
