package CityTorontoBank;

public interface IMortgageConstants {

	/*includes constant values for short-term (one year), medium-term (three years) and long-term (5 years) mortgages.
	 * It also contains constants for bank name and the maximum mortgage amount.*/
	
		public static int SHORT_TERM_MORTGAGE = 1;
		public static int MEDIUM_TERM_MORTGAGE = 3;
		public static int LONG_TERM_MORTGAGE = 5;
	
		public static String BANK_NAME = "City Toronto Bank";
		public static double MAX_MORTGAGE = 300000;
}