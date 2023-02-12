
public class StringBufferdem {

	
	
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("My name is Kavitha");
		
		System.out.println(sb.reverse());
		
		String a="hello";
		a.concat("k");
		System.out.println(a);
		a =a.concat("k");
		System.out.println(a);
		
		String s=new String("hell");
		
		String s1=new String("hell");
		System.out.println(s==s1);
		
}
}