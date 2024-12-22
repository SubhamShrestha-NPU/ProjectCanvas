import java.util.*;

class RockPaperScissor {
    public static void main(String[] args) {
        int r, a, b;
        String computerChoice;

        System.out.println("1. Rock \n2. Paper \n3. Scissor");
        System.out.print("Enter your choice number: ");

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a >= 1 && a <= 3) {
            Random rn = new Random();
            r = rn.nextInt((3 - 1) + 1) + 1;
            switch (r) {
                case 1:
                    computerChoice = "Rock";
                    break;
                case 2:
                    computerChoice = "Paper";
                    break;
                case 3:
                    computerChoice = "Scissor";
                    break;
                default:
                    computerChoice = "Invalid";
                    break;
            }
            System.out.println("Computer choose: " + computerChoice);

            b = a - r;
            switch (b) {
                case -2:
                    System.out.println("You win, computer lose");
                    break;

                case -1:
                    if (r % 2 == 0) {
                        System.out.println("You win, computer lose");
                    } else {
                        System.out.println("You lose, computer win");
                    }
                    break;

                case 0:
                    System.out.println("Draw");
                    break;

                case 1:
                    if (a % 3 == 0) {
                        System.out.println("You win, computer lose");
                    } else {
                        System.out.println("You lose, computer win");
                    }
                    break;

                case 2:
                    System.out.println("You lose, computer win");
                    break;

                default:
                    System.out.println("Something went wrong");
                    break;
            }
        } else {
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
