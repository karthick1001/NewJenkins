package helloworld;

public class FibanocciSeries 
{
	public static void main(String[] args)
	{
		// 0 1 1 2 3 5 8 13
		
		int i = 0, j = 1;
		for(int x=1; x <=8;x++)
		{
			System.out.print(i);
			int s = i + j;
			i = j;
			j = s;
		}
		
		
		
		
	}
}
