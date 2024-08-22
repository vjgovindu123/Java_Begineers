package aja;
import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.*;
public class Leader_num {
	public static void lead_num(int[]a) {
		int lead_c=1;
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			
				if(a[i]>max) {
					max=a[i];
					lead_c=lead_c+1;
				}
			
		}
		System.out.println("Lead Count is:"+lead_c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		int n=sc.nextInt();
		int[]a=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		lead_num(a);

	}

}
