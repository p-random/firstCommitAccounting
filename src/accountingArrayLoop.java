
public class accountingArrayLoop {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double totalValue = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		
		System.out.println("Value of Supply : "+valueOfSupply);
		
		System.out.println("VAT : "+vat);
		
		System.out.println("Total value : "+totalValue);
		
		System.out.println("Expense : "+expense);
		
		System.out.println("Income : "+income);
		
		int i = 0;
		while(i<dividendRates.length) {
			System.out.println("Dividend "+ i + " : " + income * dividendRates[i]);
			i = i +1;
		}

	}

}
