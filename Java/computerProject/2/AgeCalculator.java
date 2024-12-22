import java.util.Scanner;

class AgeCalculator {
    public static void main(String[] args) {
        int birthYear, requiredYear;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        birthYear = sc.nextInt();

        System.out.print("Enter the desired year: ");
        requiredYear = sc.nextInt();

        if (requiredYear < birthYear) {
            System.out.println("Invalid year");
        } else {
            System.out.println("Your age in " + requiredYear + " is " + (requiredYear - birthYear) + " years");
        }

        sc.close();
    }
}