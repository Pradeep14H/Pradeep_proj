package threads;

 

public class Yield extends Thread{

 

    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(Thread.currentThread().getName()+" in control "+Thread.currentThread());
            //Thread.yield();

        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Yield t1=new Yield();
        Yield t2=new Yield();

        t1.setPriority(Thread.MAX_PRIORITY-4);
        t2.setPriority(Thread.MIN_PRIORITY+2);
        t1.start();

        t2.start();
        for(int i=0;i<3;i++)
        {
            Thread.yield();
            System.out.println(Thread.currentThread().getName()+" in control"+Thread.currentThread());
        }

 

    
    }

 

}