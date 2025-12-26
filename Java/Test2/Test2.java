import java.util.*;
class Test2 {
    public static void main(String arrgs[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 1, sum = 0, n;
        System.out.print("Enter the number of terms:\t");
        n = sc.nextInt();
        System.out.println("Fibonacci sequence is:");
        System.out.print(num1 + ", " + num2 + ", ");
        sum = num1 + num2;

        for (int i = 1; i <= n; i++) {
            num1 = num2;
            num2 = sum;
            sum += num1 + num2;
            System.out.print(sum);
            if (i != n) {
                System.out.print(", ");
            }
        }
        sc.close();
    }
}