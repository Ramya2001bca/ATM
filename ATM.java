package change;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		int pin=1234;
		int balance=10000;
		int addAmount=0;
		int takeAmount=0;
		String name;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your pin number");
		int password=scanner.nextInt();
		if(password==pin) {
			System.out.println("Enter your name");
			name=scanner.next();
			System.out.println("Welcome"+name);
			while(true) {
				System.out.println("Press 1 to check your balance");
				System.out.println("Press 2 to addAmount");
				System.out.println("Press 3 to takeAmount");
				System.out.println("Press 4 to take resipt");
				System.out.println("Press 5 to exit");
				int opt=scanner.nextInt();
				switch(opt) {
				case 1:
					System.out.println("your current balance is="+balance);
					break;
				case 2:
					System.out.println("How much amount did you want to add to your amount");
					addAmount=scanner.nextInt();
					System.out.println("successfully credited");
					balance=addAmount+balance;
					break;
				case 3:
					System.out.println("How much amount did you want to take");
					takeAmount=scanner.nextInt();
					if(takeAmount>balance) {
						System.out.println("your balance is insuffient");
						System.out.println("try less than your available balance");
					}else {
						System.out.println("successfull taken");
						balance=balance-takeAmount;
					}
					break;
				case 4:
					System.out.println("welcome to all in one mini ATM");
					System.out.println("Available balance is="+balance);
					System.out.println("Amount desposited="+addAmount);
					System.out.println("Amount taken="+takeAmount);
					break;
				default:
					System.out.println("press the number below 5");
					break;
				}
				if(opt==5) {
					System.out.println("thank you");
					break;
				}
			}
		}else {
			System.out.println("wrong pin pin number");
		}

	}

}
