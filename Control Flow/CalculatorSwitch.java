import java.util.Scanner;
public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("rnter first number: ");
        float first = sc.nextFloat();
        System.out.print("enter second number: ");
        float second = sc.nextFloat();
        System.out.print("enter operator (+, -, *, /): ");
        String op = sc.next();
        switch (op) {
            case "+":
                System.out.println("result is" + (first + second));
                break;
            case "-":
                System.out.println("result is" + (first - second));
                break;
            case "*":
                System.out.println("result is" + (first * second));
                break;
            case "/":
                if (second != 0)
                    System.out.println("result is  " + (first / second));
                else
                    System.out.println("division by zero is not allowed");
                break;
            default:
                System.out.println("invalid Operator");
        }
    }
}