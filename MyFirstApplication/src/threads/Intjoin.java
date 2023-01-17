package threads;

public class Intjoin extends Thread {
	int i;
	public void printNum(){
		for(i=1;1<=10;i++)
		{
			System.out.print(i);
		}
	}
	public void run()
	{
		printNum();
	}

}
