package typeConversion;

public class LetterCount {
	public static void main(String args[])
	{
		int count=0;
		String s="MUMMY";
		char c='M';
//		char d='m';
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			{
				count++;
			}
		}
		System.out.println("No of times M Occurs in MUMMY: "+count);
		
		int count1=0;
		String s1="happy";
		char c1='p';

		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==c1)
			{
				count1++;
			}
		}
		System.out.println("No of times P Occurs in HAPPY: "+count1);
	}
}
