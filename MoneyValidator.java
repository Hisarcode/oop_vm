import java.util.Scanner;

public class moneyValidator {
    int money;
    int choose;

    void validationMoney() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Your Money Value: ");
        money = input.nextInt();

        switch (money) {
            case 5000:
                System.out.println("Balance: " + money);
                break;

            case 10000:
                System.out.println("Balance: " + money);
                break;

            case 20000:
                System.out.println("Balance: " + money);
                break;

            case 50000:
                System.out.println("Balance: " + money);
                return;

            default:
                System.out.println("Money not detected! Please try again!");
                break;
        }

        do {
            System.out.println("Increase Money: ");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Your Choice [1/2]: ");
            choose = input.nextInt();
            if (choose == 1) {
                moneyValidator add = new moneyValidator();
                add.validationMoney();
                continue;
            }

            else if (choose == 2) {
                break;
            }

            else if (choose != 1 && choose != 2) {
                System.out.println("Eror! Please try again!");
                return;
            }
        }
        while (choose == 2);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choose;

        moneyValidator run = new moneyValidator();
        run.validationMoney();

        System.out.println("Product: "); // next code in product class
    }
}
