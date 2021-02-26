package com.IOStreams;
import java.io.*;

public class ByteStream
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream oFileInputStream = null;
		FileOutputStream oFileOutputStream = null;
		try 
		{
			oFileInputStream = new FileInputStream("F:/quotes1.txt");
			oFileOutputStream = new FileOutputStream("F:/quotes2.txt");
			int nCount = 0;
			while((nCount = oFileInputStream.read()) != -1)
			{
				oFileOutputStream.write(nCount);
			}
			System.out.println("Byte Streams Executed Succesfully");
		} 
		catch (FileNotFoundException oFileNotFoundException) 
		{
			oFileNotFoundException.printStackTrace();
		}
		finally 
		{
			if(oFileInputStream != null)
				oFileInputStream.close();
			if(oFileOutputStream != null)
				oFileOutputStream.close();
		}
	}

}
