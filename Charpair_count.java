package aja;
import java.util.*;
public class Charpair_count {
	public static void paircount1(char arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]=='a'&&arr[j]=='g') {
					count=count+1;
				}
			}
		}
		System.out.print(count);
		
	}
	public static void paircount2(char arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]=='a') {
					if(arr[j]=='g') {
						count+=1;
					}
				}
			}
		}
		System.out.println(count);
	}
	public static void paircount3(char arr[]) {
		int cgcount=0;
		int ans=0;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]=='g') {
				cgcount+=1;
			}
			if(arr[i]=='a') {
				ans=ans+cgcount;
			}
		}
		System.out.println("Total ag pairs are:"+ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input Character Length");
		int n=sc.nextInt();
	
		
		System.out.print("Input Characters");
		
		char arr[]=sc.next().toCharArray();
		//paircount1(arr);
		//paircount2(arr);
		paircount3(arr);
	}

}
