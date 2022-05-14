package fileIOBasic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileIo_ObjectIO_StreamDemo implements Serializable {
public static void main(String[] args) {
	File file=new File("C:/Users/balkr/Desktop/iOStream/FOS.txt");
	
	readStreamObjectFromFile(file);
	writeStreamObjectFromFile(file);
}

private static void readStreamObjectFromFile(File file)
{
	
	
	try {
		file.createNewFile();
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee retrivedEmp=(Employee) ois.readObject();
		System.out.println(retrivedEmp);
	} 
	
	 catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	catch (FileNotFoundException e) 
	{		
		e.printStackTrace();
	} 
	catch (IOException e) 
	{		
		e.printStackTrace();
	}

 }
private static void writeStreamObjectFromFile(File file) {
	Employee emp=new Employee(20,"Sham");
	try
	{
		FileOutputStream fs=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fs);
		oos.writeObject(emp);
		oos.close();
		fs.close();
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch (IOException e) 
	{		
		e.printStackTrace();
	}
}
}
