package aja;
import java.util.*;
public class subArrayZero {
	public static boolean findduplicates(int prefarr[]) {
		
		HashSet<Integer>hs=new HashSet<>();
		for(int i=0;i<prefarr.length;i++) {
			if(hs.contains(prefarr[i])) {
				return true;
				
			}
			else {
				hs.add(prefarr[i]);
			}
			
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int prefarr[]=new int [arr.length];
		prefarr[0]=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			prefarr[i]=arr[i]+prefarr[i-1];	
		}
//		for(int i=0;i<arr.length;i++) {
//			if(prefarr[i]==0) {
//				System.out.println("Array Contains SubArray sum Zero at index "+i);
//			}
//			else {
//				//System.out.println("Array does not contains SubArray Zero");
//				
//			}
//		}
		
		boolean res=findduplicates(prefarr);
		if(res==true) {
			System.out.println("Subarray with hashset zero");
		}
		else {
			System.out.println("Subarray with hashset nonzero");
		}
		
		
		
		

	}

}
