
public class ReverseNumber {

	public static void main(String[] args) {
		int number=450;
		int remainder,rev=0;
		while (number>0) {
			
			remainder=number%10;
			System.out.print(remainder);
			number=number/10;
		}
		

	}

}
