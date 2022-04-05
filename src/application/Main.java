package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		try {
			System.out.print("Enter account number: ");
			int number = sc.nextInt();
			System.out.print("Enter account holder: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Is there any initial deposit (y/n)? ");
			char x = sc.next().charAt(0);
			double balance = 0.0;
			account = new Account(number, name, balance);
			while (x != 'y' && x != 'n') {
				System.out.print("Enter a valid value: ");
				x = sc.next().charAt(0);
			}
			if (x == 'y') {
				System.out.print("Enter initial deposit value: ");
				account.deposit(sc.nextDouble());
				System.out.println();
			} else {
				System.out.println();
			}

			System.out.println("Account data: ");
			System.out.println(account);
			System.out.println();

			System.out.print("Enter a deposit value: ");
			account.deposit(sc.nextDouble());
			System.out.println();
			System.out.println("Updated account data: ");
			System.out.println(account);
			System.out.println();

			System.out.print("Enter a withdraw value: ");
			account.withdraw(sc.nextDouble());
			System.out.println();
			System.out.println("Updated account data: ");
			System.out.println(account);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}
}
