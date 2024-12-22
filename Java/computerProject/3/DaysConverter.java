import java.util.Scanner;

class DaysConverter {
    public static void main(String[] args) {
        int d, day, month, year;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        d = sc.nextInt();

        day = (d % 365) % 30;
        month = ((d % 365) - day) / 30;
        year = (d - (month * 30 + day)) / 365;

        System.out.println(d + " days is same as " + year + " year(s), " + month + " month(s) and " + day + " day(s)");

        sc.close();
    }
}