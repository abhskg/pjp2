package incomereport.basic;

public class Income {

	private String city;
	private String country;
	private String gender;
	private String currency;
	private Double amount;
	
	public Income () {
		super();
	}
	
	public Income(String city, String country, String gender, String currency, Double amount) {
		super();
		this.city = city;
		this.country = country;
		this.gender = gender;
		this.currency = currency;
		this.amount = amount;
	}
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return " < === Income : city=" + city + ", country=" + country + ", gender=" + gender + ", currency=" + currency
				+ ", amount=" + amount + " === >";
	}	

	public Double getUSDAmount() {
		if(this.getCurrency().equalsIgnoreCase("INR"))
			return (this.getAmount())/CurrencyRate.INR;
		else if(this.getCurrency().equalsIgnoreCase("SGD"))
			return (this.getAmount())/CurrencyRate.SGD;
		else if(this.getCurrency().equalsIgnoreCase("HKD"))
			return (this.getAmount())/CurrencyRate.HKD;
		else if(this.getCurrency().equalsIgnoreCase("GBP"))
			return (this.getAmount())/CurrencyRate.GBP;
		else
			return this.getAmount();
	}
	
}
