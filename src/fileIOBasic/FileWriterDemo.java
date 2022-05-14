package fileIOBasic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
public static void main(String[] args) {
	readfileUsingBufferedReader();
	 writeAFile();
	 readFileUsingFileReader();
}
private static void readfileUsingBufferedReader()
{
	File file=new File("C:/Users/balkr/Desktop/iOStream/write.txt");
	
	FileReader fr=null;
	BufferedReader bufferedReader=null;
	try {
		
		fr=new FileReader(file);
		bufferedReader=new BufferedReader(fr);
		String data=bufferedReader.readLine();
		System.out.println(data);
	}
	catch (IOException e) 
	{
		System.out.println("error while reading");
	}
	finally
	{
		try
		{
			bufferedReader.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	System.out.println("successfully file created");
}
private static void writeAFile() {
	File file=new File("C:/Users/balkr/Desktop/iOStream/write.txt");
	FileWriter fileWriter=null;
	String data="welcome to java world!!";
	try {
		file.createNewFile();
		fileWriter=new FileWriter(file);//(file,true)lihil tar data continuous add hoto file madhe;
		fileWriter.write(data);
		System.out.println("succefully write file");
	}
	catch(IOException e)
	{
		System.out.println("error");
		e.printStackTrace();
	}
	finally
	{
		try {
			fileWriter.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
private static void readFileUsingFileReader() {
	File file=new File("C:/Users/balkr/Desktop/iOStream/write.txt");
	FileReader fileReader=null;
	try
	{
		fileReader=new FileReader(file);
		int content;
		while((content=fileReader.read())!=-1)
		{
			System.out.println((char)content);
		}
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	finally
	{
		try {
			fileReader.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
}
