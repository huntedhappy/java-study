// instance 를 사용시 static이 들어 가면 안됨
class Accounting {
	public double ValueOfSupply;
	public double vatRate;
	public double expenseRate;

	public void print() {
		
		System.out.println("Value of Supply :"+ValueOfSupply);
		System.out.println("VAT :"+getVAT());
		System.out.println("Total :"+getTotal());
		System.out.println("Expense :"+getExpense());
		System.out.println("Income :"+getIncome());
		System.out.println("Dividend :"+getDividend1());
		System.out.println("Dividend :"+getDividend2());
		System.out.println("Dividend :"+getDividend3());

	}

	public double getDividend1() {
		return getIncome() * 0.5;
	}
	public double getDividend2() {
		return getIncome() * 0.3;
	}
	public double getDividend3() {
		return getIncome() * 0.2;
	}	
	public double getIncome() {
		return ValueOfSupply - getExpense();
	}

	public double getExpense() {
		return ValueOfSupply * expenseRate;
	}

	private double getTotal() {
		return ValueOfSupply + getVAT();
	}

	private double getVAT() {
		return ValueOfSupply * vatRate;
	}	
}
public class AccountingClassApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// class 앞에 new를 붙이는 것을 instance
		Accounting a1 = new Accounting();		
		a1.ValueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();		
		a2.ValueOfSupply = 20000.0;
		a2.vatRate = 0.1;
		a2.expenseRate = 0.2;
		a2.print();		
	}
	
}