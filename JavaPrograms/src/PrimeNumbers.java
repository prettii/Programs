
public class PrimeNumbers {
	
	
	public static void PrimeNumber(int number)
	{
	
		
		for(int i=1;i<=number;i++)
		{	
			int count=0;
			for(int j=2;j<i;j++) {
				
				
				if(i%j==0)
				{
					count++;
				}
			
			}
if (count==0)
				
				System.out.println(i+" ");
				
				
		}
	}
	
	
	
	
	public static void main(String args[])
	{
		PrimeNumbers.PrimeNumber(100);
	}

}
