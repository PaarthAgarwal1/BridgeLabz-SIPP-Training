import java.util.*;
class d1_programingElement {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the distance in km : ");
		double km=sc.nextDouble();
		double miles=km*1.6;
		System.out.print("The total miles is "+miles+" mile for the given " +km+ "km");
	}
}
