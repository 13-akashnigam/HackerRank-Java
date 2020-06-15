import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_061520_06_JavaDatatypes 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		for(int i=0; i<T; i++)
		{
			String stringInput="";
			try
			{
				stringInput = in.readLine();
				long input = Long.parseLong(stringInput);
				System.out.println(input+" can be fitted in:");
				if(input>=Byte.MIN_VALUE && input<=Byte.MAX_VALUE)
					System.out.println("* byte");
				if(input>=Short.MIN_VALUE && input<=Short.MAX_VALUE)
					System.out.println("* short");
				if(input>=Integer.MIN_VALUE && input<=Integer.MAX_VALUE)
					System.out.println("* int");
				if(input>=Long.MIN_VALUE && input<=Long.MAX_VALUE)
					System.out.println("* long");
			}
			catch(NumberFormatException nfe)
			{
				System.out.println(stringInput+" can't be fitted anywhere.");
			}
		}
	}
}
