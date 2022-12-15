package assignment1;

public class AssignQus7 
{

	public static void main(String[] args) 
	{
		String a="live on wild life";
		String life[]=a.split(" "),s="life";
		int b=life.length,count=0;
		for(int i=0;i<b;i++)
		{
			if(life[i].equals(s))
			{
				count++;
			}
		}
		System.out.println("Totall nomber of life  comming is: "+count);
    
	}

}
