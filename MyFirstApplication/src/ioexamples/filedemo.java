package ioexamples;
import java.io.*;
public class filedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			FileInputStream fin = new FileInputStream("desktop://H,Pradeep://io.txt");
			byte[]bt = new byte[fin.available()];
			fin.read(bt);
			for(byte b:bt)
			{
				System.out.print((char)b);
			}
			}
		catch(FileNotFoundException e){
			System.out.print(e);
		}
		catch(FileNotFoundException e1){
			System.out.print(e1);
		}

	}
}
