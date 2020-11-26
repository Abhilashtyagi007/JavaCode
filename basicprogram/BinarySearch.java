package basicprogram;

import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]  = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		for(int i=0;i<q;i++) {
			int x = sc.nextInt();
			
			int res = binary(arr,x,arr.length);
			if(res == -1) {
				System
			}
		}
	}
	
	static int binary(int arr,int key,int r) {
		
		int l=0;
		while(l<r) {
			int m = (l+r)/2;
			
			if(arr[m]<key) {
				l = mid+1;
			}else if(arr[m]>key) {
				r = mid-1;
			}
			else return mid;
		}
		return -1;
	}

}
