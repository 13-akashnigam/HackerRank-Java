import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_061520_04_JavaStdinAndStdout_II 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(in.readLine());
		double d = Double.parseDouble(in.readLine());
		String s = in.readLine();

		System.out.println("String: "+s);
		System.out.println("Double: "+d);
		System.out.println("Int: "+a);
	}
}
