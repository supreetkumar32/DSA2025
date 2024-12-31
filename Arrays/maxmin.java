package array;

public class maxmin {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,39,3,4,5,34,6};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min)
				min=a[i];
			
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("maximum " +max);
		System.out.println("minimum " +min);

	}
	

}
