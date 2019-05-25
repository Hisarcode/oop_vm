import java.util.Scanner;
public class vm {
    public static void main(String[] args) {
        int Food = runMenu();
        int Price = retrievePrice(Food);
        int change = moneyInserted(Price);
    }

    public static int runMenu(){
        Scanner keyboard = new Scanner(System.in);
        int choice = 0 ;
        System.out.println("\n\nPlease enter your selection:"
                + "\n1: Snickers \t 125"
                + "\n2: Reeses Cup \t 130"
                + "\n3: Doritoes \t 150"
                + "\n4: Pepsi \t 185"
                + "\n5: Exit ");
        choice = keyboard.nextInt();
        return choice;
    }

    public static int retrievePrice(int menuChoice){
        if (menuChoice == 1)
            return 125;
        if (menuChoice == 2)
            return 130;
        if (menuChoice == 3)
            return 150;
        if (menuChoice == 4)
            return 185;
        else return 0;
    }

    public static int moneyInserted(int Price){
        Scanner keyboard = new Scanner(System.in);
        int money = 0;
        System.out.println("Your item costs: " + Price + " Please enter the amount of money:");
        money = keyboard.nextInt();
        while (money < Price){
            System.out.println("Please insert sufficient funds");
            money = money + keyboard.nextInt();
        }
        return money - Price ;
    }

    public static void changeOut(int change){
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        while (change >= 25){
            quarters = quarters + 1;
            change = change - 25;
        }
        while (change >= 10){
            nickels = dimes + 1;
            change = change - 10;
            while (change >= 5){
                nickels = nickels + 1;
                change = change - 5;
            }
        }
    }
}
