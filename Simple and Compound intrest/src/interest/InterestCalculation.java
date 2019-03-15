package interest;

//Class for calculating Simpe and Compound interest
public class InterestCalculation {
	
	//method for Simple Interest Calculation
	public double simpleInterest(double principle, double rate, double time) {
		return (principle * rate * time) / 100;
	}
	
	//method for Compound Interest Calculation
	public double compoundInterest(double principle, double rate, double time) {
		return principle * (Math.pow((1 + rate / 100), time)); 
	}

}
