import java.util.Scanner;
public class calci2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        String  operator;
        String yesOrno = "y";
        while (yesOrno .equals("y") ) {
            System.out.println("Enter two integer numbers to do arithmetic operation:");
            num1= scanner.nextInt();
            num2= scanner.nextInt();
            System.out.println("Enter any arithmetic operation (+,-,/,*,% to calculate between the numbers:");
            operator = scanner.next();
            System.out.println(operator);
            switch (operator) {
                case "+":
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case "-":
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case "*":
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case "/":
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                case "%":
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                    break;
                default:
                    System.out.println("Invalid Operator");}
            System.out.println("Do you want to continue (y/n):");
            yesOrno= scanner.next();
        }
    }
}
