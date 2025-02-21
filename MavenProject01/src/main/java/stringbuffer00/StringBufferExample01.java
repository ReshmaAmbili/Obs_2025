package stringbuffer00;

public class StringBufferExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer var1=new StringBuffer("1st buffer");
		
		//insert method
		
		var1.insert(4,"new");//adding new value to 4th position after space.
		System.out.println(var1);
		
		//append method(to add last)
		
		var1.append("second");
		System.out.println(var1);//last insert
		
//delete Method
		
		var1.deleteCharAt(2);
		System.out.println(var1);//will remove 2nd position charctr.
		var1.delete(4, 6);//it will delete before this index. So should give+1
		System.out.println(var1);
		
		//replace method
		
		var1.replace(0, 4, "Hi");//replacing and adding new value
		System.out.println(var1);
		
		//Reverse method
		
		var1.reverse();
		System.out.println(var1);//reversing string value
		
		
	}
	
	

}
