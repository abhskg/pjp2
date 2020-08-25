package incomereport.main;

import java.util.List;
import java.util.Scanner;

import incomereport.basic.Income;
import incomereport.basic.Summary;
import incomereport.util.CSVScanner;
import incomereport.util.ReportGenerateFromSummary;
import incomereport.util.SummaryGeneration;

public class IncomeSummaryReportGenerate {

	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the name for input file (CSV) : ");
		String inputFile = read.nextLine();
		
		List<Income> incomeInput = CSVScanner.readCSV(inputFile);
				
		List<Summary> summary = SummaryGeneration.generate(incomeInput);
		
		
		System.out.println("Enter the name for output file (CSV) : ");
		String outputFile = read.nextLine();

		ReportGenerateFromSummary.generate(summary, outputFile);
				
		System.out.println(summary);
		
		read.close();
	}
	
}
