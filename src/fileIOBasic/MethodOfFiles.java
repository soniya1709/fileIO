package fileIOBasic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MethodOfFiles {
public static void main(String[] args) throws IOException {
	File file=new File("C:/Users/balkr/Desktop/Soniya Sabale/xyz.txt");
	String filepath=file.getAbsolutePath();
	System.out.println(file.getPath());
	String data="Hello I am java Developer";
	FileWriter fileWriter=new FileWriter(file);
	String filename="/pqr.txt";
	File file1=new File(filepath+filename);
	System.out.println("file exists?"+file1.exists());
	file.createNewFile();
	file1.createNewFile();
	System.out.println(file.length());
	System.out.println("isFile" +file1.isFile());
	try
	{
		fileWriter.append(data);
	}
	catch(IOException e)
	{
		System.out.println("unable to write data");
		e.printStackTrace();
	}
	finally {
		try {
			fileWriter.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	System.out.println("file sucessfully crated");
}


}

