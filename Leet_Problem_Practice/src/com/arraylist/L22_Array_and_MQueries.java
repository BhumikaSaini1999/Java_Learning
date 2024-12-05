package com.arraylist;

import java.util.Scanner;

//Given an Array and M queries, each query will have an index i, 
//we need to find max of all array elements except a[i]
public class L22_Array_and_MQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array n: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter array elements:");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter number of queries i.e. m:");
		int m = sc.nextInt();
		int queries[] = new int[m];
		System.out.println("Enter m queries: ");
		for(int i=0; i<queries.length; i++) {
			queries[i]=sc.nextInt();
		}
		
		printMax(arr,queries);
		sc.close();
	}
	
	private static void printMax(int[] arr, int[] queries) {
		int max = Integer.MIN_VALUE, sec_max=Integer.MIN_VALUE;
		int maxIndx=-1, sec_maxIndx=-1;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=max) {
				sec_max=max;
				sec_maxIndx=maxIndx;
				max=arr[i];
				maxIndx=i;
			}else if(arr[i]>sec_max) {
				sec_max=arr[i];
				sec_maxIndx=i;
			}
		}
		System.out.println("max: "+max+" sec_max: "+sec_max);
		System.out.println("maxIndx: "+maxIndx+" sec_maxIndx: "+sec_maxIndx);
		
		int ans=0;
		for(int query : queries) {//O(m)
			if(query<maxIndx || query>maxIndx)
				ans=max;
			else if(query==maxIndx)
				ans=sec_max;
			System.out.println(ans);
		}
	}
	
//	private static void printMax(int[] arr, int[] queries) {
//		// TODO Auto-generated method stub
//		
//		int[] prefix = new int[arr.length];
//		for(int i=0; i<arr.length; i++) {
//			prefix[i]= i==0 ? arr[0] : Math.max(prefix[i-1], arr[i]);
//		}
//		
//		int[] suffix = new int[arr.length];
//		for(int i=arr.length-1; i>=0; i--) {
//			suffix[i]= i==arr.length-1 ? arr[arr.length-1] : Math.max(suffix[i+1], arr[i]);
//		}
//		
//		int ans=0;
//		for(int query : queries) {
//			if(query==0)
//				ans=suffix[query+1];
//			else if(query==prefix.length-1)
//				ans=prefix[prefix.length-2];
//			else
//				ans=Math.max(prefix[query-1], suffix[query+1]);
//				
//		    System.out.println(ans);
//		}
//	}
}
