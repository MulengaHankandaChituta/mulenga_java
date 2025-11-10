
public class MainInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterestCalculator ic = new InterestCalculator();
		double principal = 10000;
		double rate = 5;
		double time = 2;
		double interest = ic.calculate(principal, rate, time);
		System.out.println("Simple Interest = " + interest);

	}

}
