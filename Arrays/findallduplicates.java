package array;

public class findallduplicates {
	
//1 to N-1 tak number present hai
	//so 1 duplicate element is there 
	//we have to find that duplicate element
	public static void main(String[] args) {
		int a[]= {1,2,3,4,4,5};
        int sum=0;
        int n=a.length;
        for(int i=0;i<a.length;i++) {
        	sum=sum+a[i];
        }
        int result=sum-(n*(n-1))/2;
		System.out.println(result);
	}
	

}
