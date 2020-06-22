import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Date_062220_12_JavaAnagrams 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s1 = in.readLine();
		String s2 = in.readLine();

		int len1 = s1.length();
		int len2 = s2.length();

		if(len1 != len2)
		{
			System.out.println("Not Anagrams");
			return;
		}

		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();

		for(int i=0; i<len1; i++)
		{
			char ch1 = s1.charAt(i);
			char ch2 = s2.charAt(i);

			if(map1.containsKey(ch1))
			{
				map1.put(ch1, map1.get(ch1)+1);
			}
			else
			{
				map1.put(ch1, 1);
			}

			if(map2.containsKey(ch2))
			{
				map2.put(ch2, map2.get(ch2)+1);
			}
			else
			{
				map2.put(ch2, 1);
			}
		}

		//System.out.println(map1);
		//System.out.println(map2);

		if(map1.equals(map2))
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
	}
}