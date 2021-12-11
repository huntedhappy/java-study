
public class AccountingIFUnder10000App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ValueOfSupply = Double.parseDouble(args[0]);
		double VatRate = 0.1;
		double ExpenseRate = 0.3;
		double vat = ValueOfSupply*VatRate;
		double total = ValueOfSupply + vat;
		double expense = ValueOfSupply*ExpenseRate;
		double income = ValueOfSupply - expense;
		double devidend1 = income*0.5;
		double devidend2 = income*0.3;
		double devidend3 = income*0.2;
		
		System.out.println("Value of Supply :"+ValueOfSupply);
		System.out.println("VAT :"+vat);
		System.out.println("Total :"+total);
		System.out.println("Expense :"+expense);
		System.out.println("Income :"+income);
		System.out.println("Dividend :"+devidend1);
		System.out.println("Dividend :"+devidend2);
		System.out.println("Dividend :"+devidend3);

	}

}
