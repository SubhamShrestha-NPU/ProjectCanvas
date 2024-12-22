import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        int a, b, choice, result = 0;
        System.out.println("Simple Calculator");
        Scanner inp = new Scanner(System.in); //Declaring Scanner class
        System.out.print("Enter first number: ");
        a = inp.nextInt(); //First input
        System.out.print("Enter second number: ");
        b = inp.nextInt(); //Second input
        System.out.println("Choose an operation by the given number: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        choice = inp.nextInt(); //Operation selection

        switch (choice) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                    inp.close();
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 4.");
                break;
        } //Operation management

        System.out.println("Your result is:\t" + result);
        inp.close();
    }
}