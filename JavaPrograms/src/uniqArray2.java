
public class uniqArray2 {

	public static void main(String[] args) {

		
		int arr[]= {1,2,23,4,5,1};
		
		for(int i=0;i<=arr.length-1;i++)
			
		{
			int count=0;
			for(int j=0;j<=arr.length-1;j++)
			{
				
				if(arr[j]==arr[i])
					count++;
			}
			
			if(count==1)
			
				
				System.out.println(arr[i]);
			
		}
		
	}

}
