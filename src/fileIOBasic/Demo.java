package fileIOBasic;

import java.io.File;
import java.io.IOException;

public class Demo {
public static void main(String[] args) {
	File file=new File("demo.txt");
	try {
		file.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("file Successfully");
}
}
