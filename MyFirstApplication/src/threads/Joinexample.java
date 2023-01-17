package threads;

 

public class Joinexample extends Thread{

    public Joinexample()
    {
        setName("ChildThread");

    }
    public void run()
    {
   try
   {
       System.out.println(getName()+" has  started ...");
       Thread.currentThread().join();
   }
   catch(Exception e)
   {

   }
    }

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(Thread.currentThread().getName()+"started...");
        Joinexample t1=new Joinexample();
        t1.start();

    }

 

}