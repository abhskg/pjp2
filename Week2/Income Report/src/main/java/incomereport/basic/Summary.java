package incomereport.basic;

public class Summary {
	
	private String city;
	private String gender ;
	private Double averageSalary ;
	
		
	public Summary() {
		super();
	}

	public Summary(String city, String gender, Double averageSalary) {
		super();
		this.city = city;
		this.gender = gender;
		this.averageSalary = averageSalary;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Double getAverageSalary() {
		return averageSalary;
	}
	public void setAverageSalary(Double averageSalary) {
		this.averageSalary = averageSalary;
	}
	@Override
	public String toString() {
		return " < ===  Summary : city = " + city + ", gender = " + gender + ", averageSalary = " + averageSalary + "  ==== >";
	} 
	
	
}
