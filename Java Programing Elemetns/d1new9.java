import java.util.*;
class d1_programingElement {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the fee amount : ");
		int fee=sc.nextInt();
		System.out.print("Enter the university discount : ");
		double discountPercentage=sc.nextDouble();
		double discount=(fee*discountPercentage)/100;
		double discountedFee=fee-discount;
		System.out.print("The discount amount in INR "+discount+" and the final discounted fee is INR "+discountedFee);
	}
}