package aja;
import java.util.*;
public class primitiveDataTypes {
	
	/*
	 * primitive data types in java are broadly divided into 8types
	 * byte
	 * short
	 * int
	 * float
	 * double
	 * long
	 * char
	 * boolean
	 * */
		public static void array_byte(byte[]bytearray) {
			
			System.out.println();
			for(int i=0;i<bytearray.length;i++) {
				System.out.println(bytearray[i]);
			}

		}
		public static void array_short(short[]shortarray) {
			
			System.out.println();
			for(int i=0;i<shortarray.length;i++) {
				System.out.println(shortarray[i]);
			}

		}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		byte []bytearray=new byte[n];
		for(int i=0;i<bytearray.length;i++) {
			bytearray[i]=sc.nextByte();
		}
		array_byte(bytearray);
		
		short[]shortarray=new short[n];
		for(int i=0;i<bytearray.length;i++) {
			shortarray[i]=sc.nextShort();
		}
		array_short(shortarray);
		String str="Vijay";
		
		char arr[]=new char[str.length()];
		for(int i=0;i<str.length()-1;i++) {
			arr[i]=str.charAt(i);
		}
		
	}

}
