package JavaPrograms;

public class Test {
	public static void main(String[] args) {
//		String s1 = "1234";
//		String s2 = "1234";
//		String s3 = new String("1234");
//		System.out.println(s1==s2);
//		System.out.println(s2==s3);
//		System.out.println(s2.equals(s3));
//		System.out.println(s3.equals(s1));
		
		//------------------------->
//		int i =5;
//		int i2 = 2;
//		int i3 = i/i2;
//		System.out.println(i3);
		//------------------------------->
		
		
		String s1 = "Ram";
        String s2 = "Ram";
        String s3 = new String("Ram");
        String s4 = new String("Ram");
        String s5 = "Shyam";
        String nulls1 = null;
        String nulls2 = null;
        System.out.println(" Comparing strings with ==:");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println(s3==s1);
        System.out.println(nulls1 == nulls2);
		
	}

}
