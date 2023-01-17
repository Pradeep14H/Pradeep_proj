package threads;

public class Threadone extends Thread{
	public void interest()
	{
		float simpleinterest;
		float p=2500,r=5.6f,t=3;
		simpleinterest=(p*t*r)/100;
	}

	
		// TODO Auto-generated method stub
		public void run()
		{
		interest();	
	
		

	}

}
