
public class AccountingArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ValueOfSupply = Double.parseDouble(args[0]);
		double VatRate = 0.1;
		double ExpenseRate = 0.3;
		double vat = ValueOfSupply*VatRate;
		double total = ValueOfSupply + vat;
		double expense = ValueOfSupply*ExpenseRate;
		double income = ValueOfSupply - expense;
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
				
		double dividend1 = income * dividendRates[0];
		double dividend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];
		
		System.out.println("Value of Supply :"+ValueOfSupply);
		System.out.println("VAT :"+vat);
		System.out.println("Total :"+total);
		System.out.println("Expense :"+expense);
		System.out.println("Income :"+income);
		System.out.println("Dividend :"+dividend1);
		System.out.println("Dividend :"+dividend2);
		System.out.println("Dividend :"+dividend3);

	}

}