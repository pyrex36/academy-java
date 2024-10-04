package com.bptn.course._bigcode_week2;

public class Stock {
	
	 // Instance variables
    private String tickerSymbol;
    private String companyName;
    private int price;
    private double percentChange;
    private int totalShares;
    private long marketCap;

    // Constructor
    public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
        this.tickerSymbol = tickerSymbol.toUpperCase();
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
        this.percentChange = 0.0;
        this.marketCap = (long) price * totalShares;
    }

    // Method to adjust the price
    public void adjustPrice(int change) {
        this.price += change;
        this.percentChange = (double) change / this.price * 100;
        this.marketCap = (long) this.price * this.totalShares;
        // not putting (double) infront of change/this.price * 100;
        // resulted in the percentage change being 0%.
    }

 // Method to return a string representation of the stock
    @Override
    public String toString() {
        return "Ticker Symbol: " + this.tickerSymbol + "\n" +
               "Company: " + this.companyName + "\n" +
               "Current Price: $" + this.price + " (" + this.percentChange + "%)\n" +
               "Market Cap: $" + this.marketCap;
    }

    // Don't modify the code below:
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);
    }

}
