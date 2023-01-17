package threads;

public class Twoclassthread extends Thread {
	public void run()
	{
		try
		{
			System.out.println(t1.getDiscount());
			System.out.println(t2.getName());
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Twoclassthread 
		Thread t1 = new Thread();
		Thread t2 = new Thread();

		
		t1.run();
		//Thread t2 = new Thread();
		t2.run();
		

	}

}
