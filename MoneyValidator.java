import java.util.Scanner;

public class MoneyValidator {
	void validateMoney() { 
		Scanner input = new Scanner(System.in);
		
		int money;
		int count = 0;
		int choice;
		int total = 0;
		
		do {
			System.out.print("Input Your Money: "); //Get Money from MoneySlot Class
			money = input.nextInt(); //Get Money from MoneySlot Class
		
			while (money != 5000 && money != 10000 && money != 20000 && money != 50000) { //detecting money
				System.out.println();
				System.out.println("Money Not Detected! Please Try Again!");
				System.out.print("Input Your Money: "); //Get Money from MoneySlot Class
				money = input.nextInt(); //Get Money from MoneySlot Class
			}
		
			switch (money) { //detecting money
				case 5000: 
					System.out.println("Money " + money + " Detected! ");
					System.out.println();
					count++; //count sheet of money for MoneyCollector Class
					total = total + money; //count balance
					break;
					
				case 10000: 
					System.out.println("Money " + money + " Detected! ");
					System.out.println();
					total = total + money; //count balance
					count++; //count sheet of money for MoneyCollector Class
					break;
					
				case 20000:
					System.out.println("Money " + money + " Detected! ");
					System.out.println();
					total = total + money; //count balance
					count++;  //count sheet of money for MoneyCollector Class
					break;
				
				case 50000:
					System.out.println("Money " + money + " Detected! ");
					System.out.println();
					total = total + money; //count balance
					count++; //count sheet of money for MoneyCollector Class
					break;
			
			}
			
			if (total == 50000) { 
				System.out.println("Can't Increase Balance Again [Limit Rp50000]");
				System.out.println("Balance: " + total);
				return;
			}
			
			else if (total > 50000) {
				total = total - money;
				System.out.println("Out of Limit Rp50000");
			}
			
			System.out.println("Balance: " + total);
			System.out.println();
			System.out.println("Increase Balance? ");
			System.out.println("1. Yes");
			System.out.println("2. No");
			System.out.print("Input Your Choice [1/2]: ");
			choice = input.nextInt();
			System.out.println();
			
			if (choice != 1 && choice != 2) {
				System.out.println("Eror! Please Try Again!");
				break;
			}
		}
		while (choice == 1);		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		MoneyValidator validate = new MoneyValidator();
		
		validate.validateMoney();
	
		//Continue to Choosing Product
	}
}