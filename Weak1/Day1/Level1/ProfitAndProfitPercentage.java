public class ProfitAndProfitPercentage{
	public static void main(String[]args){

		//initialising cost price
		int costPrice=129;
	
		//initialising selling price
		int sellingPrice=191;

		//Calculating and initialising profit 
		int profit=sellingPrice-costPrice;

		//Calculating and initialising profitPercentage
		int profitPercentage=profit/costPrice*100;

		//Printing cost price and selling price
		System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice);

		//Printing cost profit and profitPercentage 
		System.out.println("The Profit is INR "+profit+" and the Profit Percentage is "+profitPercentage);
	}
}
