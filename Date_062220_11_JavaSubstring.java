import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_062220_11_JavaSubstring 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		String input[] = in.readLine().split(" ");
		int startIndex = Integer.parseInt(input[0]);
		int endIndex = Integer.parseInt(input[1]);

		System.out.println(s.substring(startIndex, endIndex));
	}
}