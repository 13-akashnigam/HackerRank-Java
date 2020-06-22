import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_062120_10_JavaStringsIntroduction 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s1 = in.readLine().toLowerCase();
		String s2 = in.readLine().toLowerCase();

		System.out.println(s1.length()+s2.length());
		if(s1.compareTo(s2)>0)
			System.out.println("Yes");
		else
			System.out.println("No");


		StringBuilder sb1 = new StringBuilder(s1);
		StringBuilder sb2 = new StringBuilder(s2);

		sb1.setCharAt(0, (char)((sb1.charAt(0))-32));
		sb2.setCharAt(0, (char)((sb2.charAt(0))-32));

		System.out.println(sb1+" "+sb2);
	}
}