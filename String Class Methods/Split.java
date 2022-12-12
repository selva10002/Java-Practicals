package stringclassmethods;

// In String the split() method used to split a line with using of Array 

public class Split
{

	public static void main(String[] args) 
	{
		int i;
		String line="Hello world I am selva 2.0";
		
		String Split[]=line.split(" ");//split() method
		
		for(i=0;i<Split.length;i++)
		{
			System.out.println(Split[i]);
		}
	}

}
