import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_062120_09_JavaStringReverse 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine().toLowerCase();
		
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		
		if(s.equals(sb.toString()))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}