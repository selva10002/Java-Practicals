package threads;

/*     Synchronized
 * 
 * this method used to multiple Thread executed at one by one by operating System Assigning.
 * 
 *  for example
 *  
 *  given program Referenced by Movie ticket booking
 *  
 *   there are multiple people can book the tickets by using an server
 *   
 *   so multiple persons can access the same server .so it have same resorcess so it have lot of problems
 *   so we can use Synchronized method to retrive the problems
 *   
 *   because Synchronized processed the Threads one bye one( that means the requests are processed one by one)
 * */


//class 1 name was MyMovie
class MyMovie
{
	int TotalTicket=10;
	
	//synchronized method 
	synchronized public void showBook(int ticket)
	{
		if(TotalTicket>=ticket)
		{
			TotalTicket=TotalTicket-ticket;
			
			System.out.println("hi "+Thread.currentThread().getName()+" Your "+ticket+" tickets are Successfully booked");
			System.out.println("Remining Tickets "+TotalTicket);
		}
		
		else
		{
			if(TotalTicket==0)
			{
				System.out.println(Thread.currentThread().getName()+" \nwe are sorry there is no tickets are available ");
			}
			else
			{
				System.out.println(Thread.currentThread().getName()+" we are Sorry .we have only "+ticket+" Tickets");
			}
		}
	}
}

//class 2 extends with Thread Class
public class SynchornizedDemo1 extends Thread
{
	static MyMovie book;
	int t;
	
	  //implements run method
	public void run()
	{
		book.showBook(t);
	}

					//main() method
	public static void main(String[] args)
	{
	 
		 book=new MyMovie();
		 
		 //calling the class 2
		 SynchornizedDemo1 sb=new SynchornizedDemo1();
		 
		 sb.t=4;
		 sb.setName("Selva");
		 sb.start();
		 
		 SynchornizedDemo1 sb2=new SynchornizedDemo1();
		 
		 sb2.t=5;
		 sb2.setName("Kanniyappan");
		 sb2.start();
		 
		 SynchornizedDemo1 sb3=new SynchornizedDemo1();
		 
		 sb3.t=2;
		 sb3.setName("Seenivasan");
		 sb3.start();
				 

	}

}
