package array;

public class swapalternate {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
        for(int i=0;i<a.length;i+=2) {
        	int temp=a[i];
        	a[i]=a[i+1];
        	a[i+1]=temp;
        }
        for(int z=0;z<a.length;z++) {
        	System.out.println(a[z]);
        }
	}
	

}
