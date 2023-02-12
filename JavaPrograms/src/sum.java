
public class sum {
	
static	int sum=0;
	public static int mul(int i, int j)
	{
		
		int k=1;
		while(k<=j)
		{
			sum=sum+i;
			k++;
		}
		return sum;
		
		
	}
	

	public static void main(String[] args) {

		
		sum=mul(7,8);
		System.out.println("sum is "+ sum);
		

	}

}
