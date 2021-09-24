package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import constants.Location;

public class CSVUtils {
	public static void main(String[] args) {
		try {
			String csvPath = Location.PROJECT + "/src/test/resources/excel/data.csv";
			List<String> readAllLines = Files.readAllLines(Paths.get(csvPath));
			for (String string : readAllLines) {
				String[] split = string.split(",");
				String first = split[0];
				String last = split[1];
				System.out.println(first);
				System.out.println(last);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
