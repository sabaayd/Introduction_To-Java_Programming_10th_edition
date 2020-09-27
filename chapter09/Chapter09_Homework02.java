package chapter09;

public class Chapter09_Homework02 {

	public static void main(String[] args) {
		
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		stock.previousClosingPrice = 34.5;
		stock.currentPrice = 34.35;

		System.out.println("\nStock name: " + stock.name);
		System.out.println("Stock symbol: " + stock.symbol);
		System.out.printf("Price-change percentage: " + stock.getChangePercent() * 100 + " %");
	}
}

