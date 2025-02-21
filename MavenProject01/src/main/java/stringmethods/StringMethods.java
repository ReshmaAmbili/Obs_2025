package stringmethods;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hello World";
		System.out.println(s.length());//length of a string
		System.out.println(s.charAt(6));//identify the index of charctrs in a method
		
		//value of methods: to convert any datatype to String type
		
		int a=3 ; //this will be stored as string so to convert this to string using, string method
				
				String v=String.valueOf(a);
		System.out.println(v);
		
		// Equals method: to compare strings content and case(case sensitive or not)
		
		String S1="hello World";
		System.out.println(s.equals(S1));
		
		String S2=new String("hello world");//String object creation
		System.out.println(S1.equals(S2));//
		
		System.out.println(S1.equalsIgnoreCase(S2));//compare content of 2 strings
		
//isEmpty Method: is string empty,then true or else false
		
		String S3="";
		System.out.println(S3.isEmpty());//true
		
		String s4="a1";
		System.out.println(s4.isEmpty());//false
		
		//Immutable 
		
		String b="Hello";
		String s5=b.concat("Java");
		System.out.println(s5);
		String s6=s5.concat("class");
		System.out.println("value of s6 concatination is : " +s6);
		
		//String Class
			StringBuffer varname=new StringBuffer("value");
			StringBuilder varname1=new StringBuilder("value");
			
	
	}

}
