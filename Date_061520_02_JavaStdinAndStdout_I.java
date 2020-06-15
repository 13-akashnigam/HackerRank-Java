import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_061520_02_JavaStdinAndStdout_I 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(in.readLine());
		int b = Integer.parseInt(in.readLine());
		int c = Integer.parseInt(in.readLine());

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
