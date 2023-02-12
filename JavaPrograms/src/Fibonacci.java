
public class Fibonacci {

	public static void main(String[] args) {
   //0a 1b sum1 2 3
		 int a=0; int b=1;
		 
		 int i=1;
		 int sum=0;
		  while(i<10)
		  {
			sum=a+b;
			System.out.println(sum);
			
			a=b;
			b=sum;
			i++;
			  
			  
		  }
				 
		
		

	}

}
