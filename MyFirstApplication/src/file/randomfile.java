package file;
import java.io.*;

public class randomfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]arr = {"Apple","Mango","Banana","Pineapple"};
		try
		{
			RandomAccessFile raf = new RandomAccessFile("c://ioexamples//objfile.txt","rw");
			for(String ele : str){
			raf.writeUTF(ele);
			}
			raf.seek(5);
			String str = raf.readline();
			System.out.println(str);
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
