package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class separate01 {
	//tttttttttwo pointer approach
//jo element 2 times aaye hai usko find karna hai
	public static void main(String[] args) {
		int a[]= {0,1,0,1,1,1,0,0};
	    int i=0;
	    int j=a.length-1;
	    while(i<j) {
	    	if(a[i]==0) {
	    		i++;
	    	}else if(a[i]==1 && a[j]==0) {
	    		int temp=a[i];
	    		a[i]=a[j];
	    		a[j]=temp;
	    		i++;
	    		j--;
	    	}else {
	    		j--;
	    	}
	    }
		for(int x:a) {
			System.out.println(x);
		}

	}
	

}
