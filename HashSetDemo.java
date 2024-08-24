package aja;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {
	static HashSet<Integer>hs=new HashSet<Integer>();
	public static boolean hashing(int[]arr) {
		
		for(int x:arr) {
			if(hs.contains(x)) {
				return false;
			}
			else {
				hs.add(x);
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		boolean res=hashing(arr);
		System.out.println("Array contains duplicates"+res);
		
		
		
		
		
		

	}

}
