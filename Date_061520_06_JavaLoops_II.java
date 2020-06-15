import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_061520_06_JavaLoops_II 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(in.readLine());

		for(int i=0; i<q; i++)
		{
			String input[] = in.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int n = Integer.parseInt(input[2]);
			long sum = a+b;
			System.out.print(sum+" ");
			for(int j=1; j<n; j++)
			{
				sum = sum + ((long)Math.pow(2, j) * b);
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}
}
