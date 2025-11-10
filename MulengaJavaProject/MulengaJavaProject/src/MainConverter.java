
public class MainConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Converter conv = new Converter();
		double c = 25.0;
		double f = 
	conv.celsiusToFahrenheit(c);
		System.out.println(c + "C = " + f + " F ");
		double f2 = 77.0;
		double c2 =
	conv.fahrenheitToCelsius(f2);
		System.out.println(f2 + "F = " + c2 + " C ");
				

	}

}
