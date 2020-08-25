package incomereport.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import incomereport.basic.Income;

public class CSVScanner {

		
	public static List<Income> readCSV(String inputFile) {
		List<Income> incomeData = new ArrayList<Income>();
		try {
			BufferedReader bufferReader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile)));
			String line = bufferReader.readLine();
			
			while(line != null) {								
				Income income = readRecord(line);
				incomeData.add(income);
				line = bufferReader.readLine();
			}
			
			bufferReader.close();
		} catch (IOException e) {
			System.out.println("Error encountered while reading data");
			e.printStackTrace();
		}
		return incomeData;
	}

	private static Income readRecord (String text ){
		String[] row = text.split(",");
		Income incomeData = new Income();

		if (row[0] != null && row[0].trim().length() > 0) {
			incomeData.setCity(row[0]);
		}
		if (row[1] != null && row[1].trim().length() > 0) {
			incomeData.setCountry(row[1]);
		}
		if (row[2] != null && row[2].trim().length() > 0) {
			incomeData.setGender(row[2]);
		}
		if (row[3] != null && row[3].trim().length() > 0) {
			incomeData.setCurrency(row[3]);
		}
		if (row[4] != null && row[4].trim().length() > 0) {
			incomeData.setAmount(Double.valueOf(row[4]));
		}
		//System.out.println(incomeData);
		return incomeData;
	};
}
