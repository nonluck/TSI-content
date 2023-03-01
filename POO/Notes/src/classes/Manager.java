package classes;

import java.io.*;

public class Manager {
	public File[] getDocumentsList() {
		String wayForFile = new File("").getAbsolutePath();
		//System.out.println(wayForFile);
		File folder = new File(wayForFile.concat("/memory"));
		File[] listOfFiles = folder.listFiles();
		
		return listOfFiles;
	}
}
