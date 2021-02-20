package com.kumar;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream 
{
	public static void main(String[] args) throws IOException
	{
		FileReader oFileReader = null;
		FileWriter oFileWriter = null;
		try 
		{
			oFileReader = new FileReader("F:\\WorkSpace\\Core Java\\hello.java");
			oFileWriter = new FileWriter("F:/xyz.txt");
			int nCount;
			while((nCount = oFileReader.read()) != -1)
			{
				oFileWriter.write(nCount);
			}
			System.out.println("Character Stream Executed Sucessfully");
		}
		catch (FileNotFoundException oException) 
		{
			oException.printStackTrace();
		}
		finally 
		{
			if(oFileReader != null)
				oFileReader.close();
			if(oFileWriter != null)
				oFileWriter.close();
		}
	}
}
