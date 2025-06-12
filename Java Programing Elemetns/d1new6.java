class d1_programingElement{
	public static void main(String args[]){
		int fee=125000;
		int discountPercentage=10;
		int discount=(fee*discountPercentage)/100;
		int discountedFee=fee-discount;
		System.out.print("The discount amount in INR "+discount+" and the final discounted fee is INR "+discountedFee);
	}
}