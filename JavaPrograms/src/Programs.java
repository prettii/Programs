
public class Programs {

	public static void main(String args[])
	{
		
		String s="kavitha";
		
		
		for(char i='a';i<='z';i++)
			
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				
				if(i==s.charAt(j))
				{
				count++;	
			}
			
		}
			
			if(count!=0)
			{
			System.out.println("frequency of each character is"+ i + count );
			}
	}
}
}