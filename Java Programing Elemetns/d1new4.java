class d1_programingElement{
	public static void main(String args[]){
		int costPrice=129;
		int sellingPrice=191;
		int profit=sellingPrice-costPrice;
		double profitPercentage=(profit*100)/(double)costPrice;
		System.out.print("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice+"\nThe profit is INR "+profit+" and the profit percentage is "+profitPercentage);
	}
}