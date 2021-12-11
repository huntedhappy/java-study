
public class AccountingIFApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ValueOfSupply = Double.parseDouble(args[0]);
		double VatRate = 0.1;
		double ExpenseRate = 0.3;
		double vat = ValueOfSupply*VatRate;
		double total = ValueOfSupply + vat;
		double expense = ValueOfSupply*ExpenseRate;
		double income = ValueOfSupply - expense;
		
		double dividend1 = income*0.5;
		double dividend2 = income*0.3;
		double dividend3 = income*0.2;
		
		if(income > 10000.0) {
			dividend1 = income * 0.5;
			dividend2 = income * 0.3;
			dividend3 = income * 0.2;
		} else {
			dividend1 = income * 1.0;
			dividend2 = income * 0;
			dividend3 = income * 0;			
			
		}
		
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