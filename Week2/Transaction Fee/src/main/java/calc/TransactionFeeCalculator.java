package main.java.calc;

import java.util.List;
import java.util.Scanner;

import main.java.basic.Transaction;
import main.java.util.CsvIO;

public class TransactionFeeCalculator {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		System.out.println("Write Input File name : "); 	
		String inputFile = "C:\\Users\\Abhas\\Pictures\\PS PJP2\\PS	 GIT Point\\test\\Sample_Data_Fee_Calculator.csv";
//		String inputFile = read.nextLine();

		
		System.out.println("Write Output File name : ");
		String outputFile = "C:\\Users\\Abhas\\Pictures\\PS PJP2\\PS GIT Point\\test\\output.csv";
//		String outputFile = read.nextLine();

		List<Transaction> transactions = CsvIO.readCSV(inputFile);
		transactions = TransactionProcess.process(transactions);

		List<Transaction> groupedTransactions = OrganiseTransactions.group(transactions);
		CsvIO.writeCSV(groupedTransactions, outputFile);
		
		read.close();
		
	}
}
