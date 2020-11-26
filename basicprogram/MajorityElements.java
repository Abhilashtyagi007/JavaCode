package basicprogram;

import java.util.*;

public class MajorityElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("size of array");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n;i++) {
			a[i] = sc.nextInt();
		}
		findCandidate(a,n);
		
	}
	
	
	public static void findCandidate(int a[],int size) {
		int mi=0;
		int count = 1;
		for(int i=1;i<size;i++) {
			if(a[mi]==a[i]) {
				count++;
			}
			else {
				count--;
			}
			
			if(count == 0) {
				mi=i;
				count = 1;
			}
		}
		int c=0;
		for(int i=0;i<size;i++){
			if(a[i]==a[mi]){
				c++;
			}
		}
		if(c>size/2) {
			System.out.println("the majority element is : "+a[mi]);
		}
		else {
			System.out.println("not found any:");
		}
		
	}

}
