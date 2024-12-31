package array;

public class movezerostoright {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,7,8,5,7};
		int n=a.length;
		for(int i=0;i<n;i=i+2) {
			if(i+1 <n) {
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			}
		}

		
        for(int z=0;z<a.length;z++) {
        	System.out.println(a[z]);
        }
	}
	

}
