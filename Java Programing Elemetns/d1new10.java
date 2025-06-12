import java.util.*;
class d1_programingElement {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your height in cm : ");
		int height=sc.nextInt();
		double heightInInches=height/2.54;
		double heightInFeet=heightInInches/12;
		System.out.print("Your height in cm is "+height+" while in feet is "+heightInFeet+" and inches is "+heightInInches);
	}
}