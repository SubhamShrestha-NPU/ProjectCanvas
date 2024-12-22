import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + "!");
        System.out.println("KHAMIS-ROCHE CALCULATOR");

        System.out.print(name + ", PLEASE ENTER YOUR CURRENT HEIGHT IN cm: ");
        float height = scanner.nextFloat();

        System.out.print("ENTER YOUR CURRENT WEIGHT IN kg: ");
        float weight = scanner.nextFloat();

        System.out.print("ENTER YOUR CURRENT AGE IN years: ");
        float age = scanner.nextFloat();

        System.out.print("ENTER YOUR MOTHER'S HEIGHT IN cm: ");
        float mother = scanner.nextFloat();

        System.out.print("ENTER YOUR FATHER'S HEIGHT IN cm: ");
        float father = scanner.nextFloat();

        System.out.println("ENTER YOUR GENDER:");
        System.out.println("1: MALE");
        System.out.println("2: FEMALE");
        System.out.print("ENTER YOUR OPTION NUMBER: ");
        int gender = scanner.nextInt();

        double predictedHeight;
        float averageParentHeight = (mother + father) / 2.0f;

        if (gender == 1) {
            predictedHeight = 52.5 + 0.593 * (height + averageParentHeight) + 0.142 * weight - 0.00022 * weight * weight - 0.00013 * (height + averageParentHeight) * (height + averageParentHeight);
        } else {
            predictedHeight = 42.1 + 0.579 * (height + averageParentHeight) + 0.161 * weight - 0.00018 * weight * weight - 0.00013 * (height + averageParentHeight) * (height + averageParentHeight);
        }

        System.out.println(name + "(" + age + " years)" + ", YOUR PREDICTED ADULT HEIGHT IS " + predictedHeight + " cm");

        scanner.close();
    }
}
