package bank;

public class candidate {
	public void checkmarks(int marks)throws Exception{
		if(marks<=30){
			throw new Exception{"marks invalid"};
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			candidate c=new candidate();
			c.checkmarks(2);
		}
		catch (Exception e)
		{
			System.out.println("exceptin");
			e.printStackTrace();
			
		}

	}

}
