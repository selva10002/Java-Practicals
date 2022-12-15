package assignment1;

public class AssQus10 
{

	public static void main(String[] args) 
	{
		String Line="mam is in the room";
		int a=Line.length(),count1=0,count2=0;
		char ch1='n',ch2='m';
		for(int i=0;i<a;i++)
		{
			if(ch2==Line.charAt(i))
			{
				count1++;
			}
			else 
			{
				if(ch1==Line.charAt(i))
				{
				count2++;
				}
			}
			
		}
		System.out.println("Total number of n : "+count2+ "\nTotal number of m :"+count1);
	}

}
