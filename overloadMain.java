package aja;

public class overloadMain {
	public static void main(int a)
	{
		System.out.println("Main Method-2"+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method-1");
		overloadMain olm=new overloadMain();
		olm.main(10);
		olm.main();

	}
	public static void main() {
		System.out.println("Main Method-3");
		
		
		
	}

}
