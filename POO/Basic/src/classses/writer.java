package classses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class writer {
	private static final String COMMA_DELIMITER = ",";

	List<List<String>> getdata() throws FileNotFoundException, IOException {
		String filePath = new File("").getAbsolutePath();
		List<List<String>> records = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filePath.concat("/src/data.csv")))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        String[] values = line.split(COMMA_DELIMITER);
		        
		        records.add(Arrays.asList(values));
		    }
		}return records;
	}
}
