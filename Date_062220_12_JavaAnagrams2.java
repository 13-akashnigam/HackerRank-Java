import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Date_062220_12_JavaAnagrams2 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s1 = in.readLine().toLowerCase();
		String s2 = in.readLine().toLowerCase();

		int len1 = s1.length();
		int len2 = s2.length();

		if(len1 != len2)
		{
			System.out.println("Not Anagrams");
			return;
		}

		char chars1[] = s1.toCharArray();
		char chars2[] = s2.toCharArray();

		//System.out.println(Arrays.toString(chars1));
		//System.out.println(Arrays.toString(chars2));

		java.util.Arrays.sort(chars1);
		java.util.Arrays.sort(chars2);

		//System.out.println(Arrays.toString(chars1));
		//System.out.println(Arrays.toString(chars2));

		for(int i=0; i<len1; i++)
		{
			if(chars1[i] != chars2[i])
			{
				System.out.println("Not Anagrams");
				return;
			}
		}
		System.out.println("Anagrams");
	}
}