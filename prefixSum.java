package aja;

import java.util.Scanner;

public class prefixSum {
	public static void prefixsum_array(int[] arr) {
		int prefarr[]=new int[arr.length];
		prefarr[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			prefarr[i]=prefarr[i-1]+arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(prefarr[i]);
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		prefixsum_array(arr);

	}

}
