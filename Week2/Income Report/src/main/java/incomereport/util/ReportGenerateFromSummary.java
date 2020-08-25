package incomereport.util;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import incomereport.basic.Summary;

public class ReportGenerateFromSummary {

	private static final String CSV_DELIMITER = ",";
	
	public static void generate(List<Summary> summary, String outputFile) {

		
		try {
			BufferedWriter bufferWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), "UTF-8"));
			StringBuffer str = new StringBuffer();
			
			str.append("City" + CSV_DELIMITER + "Gender" + CSV_DELIMITER + "Average Income");
			bufferWriter.write(str.toString());
			bufferWriter.newLine();
			
			for ( Summary sum : summary) {

            	str = new StringBuffer();
                str.append(sum.getCity().trim().length() == 0 ? "" : sum.getCity());
                str.append(CSV_DELIMITER);
                str.append(sum.getGender().trim().length() == 0? "" : sum.getGender());
                str.append(CSV_DELIMITER);
                str.append(sum.getAverageSalary());
                str.append(CSV_DELIMITER);

                bufferWriter.write(str.toString());
    			bufferWriter.newLine();
    			
			}			
			
			bufferWriter.close();
		}
		catch (UnsupportedEncodingException  e) {
			System.out.println("Error encountered in Due to Encoding Format");
			e.printStackTrace();
		}
		catch (FileNotFoundException e) {
			System.out.println("File Format Passed in not valid");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Exception occured while writing to file");
			e.printStackTrace();
		}
		
	}

}
