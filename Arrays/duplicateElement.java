package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class duplicateElement {
	
//jo element 2 times aaye hai usko find karna hai
	public static void main(String[] args) {
		int a[]= {4,3,2,7,8,2,3,1};
		List<Integer> l=new ArrayList<>();
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			if(hs.contains(a[i])) {
				l.add(a[i]);
			}else {
				hs.add(a[i]);
			}
		}
		for(int x:l) {
			System.out.println(x);
		}
		

	}
	

}
