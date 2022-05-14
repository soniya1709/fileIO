package filesclass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesDemo {
public static void main(String[] args) {
	Path path=Paths.get("C:/Users/balkr/Desktop/iOStream/file.txt");
	try {
//		Path createdFilePath=Files.createFile(path);
//		System.out.println("File created at Path:"+createdFilePath);
	List<String> lines=Files.readAllLines(path);
		System.out.println(lines);
		int totalLines=lines.size();
    System.out.println(totalLines);		
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	System.out.println("File Successfully create");
}
}
