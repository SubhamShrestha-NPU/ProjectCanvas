import java.util.Scanner;
class BMIcalculator {
    public static void main(String[] args) {
        float h, w, bmi;
        String category;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in m: ");
        h = sc.nextFloat();
        System.out.print("Enter your weight in kg: ");
        w = sc.nextFloat();
        bmi = w / (h * h);
        if (bmi <= 18.5) {
            category = "Underweight";
        } else if (bmi <= 25) {
            category = "Normal";
        } else if (bmi <= 30) {
            category = "Overweight";
        } else {
            category = "Obese";
        }
        System.out.println("Your BMI is: " + bmi + "(" + category + ")");
        sc.close();
    }
}