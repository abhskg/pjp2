package incomereport.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import incomereport.basic.Income;
import incomereport.basic.Summary;

public class SummaryGeneration {

	public static List<Summary> generate(List<Income> incomeInput) {
		
		List <Summary> summary = new ArrayList<Summary>();
 		Map<String, Map<String, Double>> groupedIncome = incomeInput.stream()
				.collect(
				Collectors.groupingBy( Income::getCity, 
						Collectors.groupingBy(Income::getGender,
								Collectors.averagingDouble(Income::getUSDAmount) ) ) );
		
		TreeMap<String, Map<String, Double>> sortedIncome = new TreeMap<String, Map<String, Double>>();
		sortedIncome.putAll(groupedIncome);
		

		for (String city : sortedIncome.keySet()) {
			Map<String, Double> generateAvgInc = sortedIncome.get(city);

			for (String gen : generateAvgInc.keySet()) {
				Double salary = generateAvgInc.get(gen);
				summary.add(new Summary(city, gen, salary));
			}
		}
		return summary;

		
	}

}
