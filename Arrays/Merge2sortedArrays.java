package array;

public class Merge2sortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,5,7,9};
		int b[]= {2,4,8,10,11,12,14};
		int r[]=new int[a.length +b.length];
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				r[k]=a[i];
				k++;
				i++;			
			}else {
				r[k]=b[j];
				j++;
				k++;
			}
		}
			while(i<a.length)
				r[k++]=a[i++];
			while(j<b.length)
				r[k++]=b[j++];
		for(int z=0;z<a.length+b.length;z++) {
			System.out.println(r[z]);
		}

	}

}
