package threads;

public class Charjoin extends Thread{
	char c;
	public void printChar(){
		for(c='A';c<='Z';++c)
		{
			System.out.print(c);
		}
	}
	public void run(){
		printChar();
	}

}
