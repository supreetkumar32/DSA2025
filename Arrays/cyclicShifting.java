package array;

import java.util.ArrayList;

public class cyclicShifting {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		int k=2;
        int[] b=new int[a.length]; 
        for(int i=0;i<a.length;i++) {
        	b[(i+k)%a.length]=a[i];
        }
        for(int z=0;z<a.length;z++) {
        	System.out.println(b[z]);
        }
	}
	

}
