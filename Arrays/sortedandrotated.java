package array;

import java.util.ArrayList;

public class sortedandrotated {
	
	public static void main(String[] args) {
		
		int a[]= {3,4,5,1,2};
		int count=0;
		for(int i=1;i<a.length;i++) {
			if(a[i-1]>a[i]) {
				count++;
			}
		}
        if(a[a.length-1]>a[0]) {
        	count++;
        }
        
        if(count<=1) {//[1,1,1] is also sorted and rotated
        	System.out.println("Array is sorted and rotated");
        }
	}
	

}
