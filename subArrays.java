package aja;
import java.util.*;
public class subArrays {
	public static void sub_array(int[]arr) {
		int subc=0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			int subsum=0;
			System.out.println("Sub-Array Elements for"+i+"-iteration is:");
			for(int j=i;j<arr.length;j++) {
				
				System.out.println(arr[j]);
				sum=sum+arr[j];
				subc=subc+1;
				subsum+=arr[j];
				
			}
			System.out.println("Total sum of SubArray is "+subsum);
			System.out.println();
		}
		System.out.println("Total Subarrays are"+subc);
		System.out.println("Total sum of SubArray is "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		sub_array(arr);
	}

}
