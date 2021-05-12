class Accounting{
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	
	public double getDividend3() {
		return getIncome() * 0.2;
	}
	public double getDividend2() {
		return getIncome() * 0.3;
	}
	public double getDividend1() {
		return getIncome() * 0.5;
	}
	public double getIncome() {
		return valueOfSupply - getExpense();
	}
	public double getExpense() {
		return valueOfSupply * expenseRate;
	}
	private double getTotalValue() {
		return valueOfSupply + getVat();
	}
	private double getVat() {
		return valueOfSupply * vatRate;
	}
	public void print() {
		System.out.println("Value of Supply : "+valueOfSupply);
		System.out.println("VAT : "+getVat());
		System.out.println("Total value : "+getTotalValue());
		System.out.println("Expense : "+getExpense());
		System.out.println("Income : "+getIncome());
		System.out.println("Dividend 1 : "+getDividend1());
		System.out.println("Dividend 2 : "+getDividend2());
		System.out.println("Dividend 3 : "+getDividend3());
	}
}
public class accountingClass {

	public static void main(String[] args) {
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 30000.0;
		a2.vatRate = 0.1;
		a2.expenseRate = 0.3;
		a2.print();
		
	}

}
