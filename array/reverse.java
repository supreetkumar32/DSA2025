package array;

public class reverse {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
        int i=0;
        int j=a.length-1;
        while(i<j) {
        	int temp=a[i];
        	a[i]=a[j];
        	a[j]=temp;
        	i++;
        	j--;
        }
        for(int z=0;z<a.length;z++) {
        	System.out.println(a[z]);
        }
	}
	

}
