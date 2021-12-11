
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ValueOfSupply = Double.parseDouble(args[0]);
		double VatRate = 0.1;
		double ExpenseRate = 0.3;
		double vat = ValueOfSupply*VatRate;
		double total = ValueOfSupply + vat;
		double expense = ValueOfSupply*ExpenseRate;
		double income = ValueOfSupply - expense;
				
		System.out.println("Value of Supply :"+ValueOfSupply);
		System.out.println("VAT :"+vat);
		System.out.println("Total :"+total);
		System.out.println("Expense :"+expense);
		System.out.println("Income :"+income);
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
				
//		int i = 0;
//		while(i < dividendRates.length) {
//		System.out.println("Dividend :"+ (income*dividendRates[i]));
//		i = i + 1;
		int d = dividendRates.length;
		System.out.println("Test"+d);
		for (int i=0; i < dividendRates.length; ++i) {
			System.out.println("Dividend :"+ (income * dividendRates[i]));	
		}

	}

}