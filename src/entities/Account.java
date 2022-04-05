package entities;

import java.util.Scanner;

public class Account {
	private int account;
	private String holder;
	private double balance;

	public int getAccount() {
		return account;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public Account(int account, String holder, double balance) {
		this.account = account;
		this.holder = holder;
		this.balance = balance;
	}

	public double deposit(double deposit) {
		while (deposit < 0) {
			System.out.println("Deposit value can't be negative, insert a valid value: ");
			Scanner sc = new Scanner(System.in);
			deposit = sc.nextDouble();
			sc.close();
		}
		return balance += deposit;
	}

	public double withdraw(double withdraw) {
		while (withdraw > balance - 5.0) {
			System.out.println("unavaliable value of withdraw:, insert a new one: ");
			Scanner sc = new Scanner(System.in);
			withdraw = sc.nextDouble();
			sc.close();
		}
		return balance -= withdraw + 5;
	}

	public void balance(double withdraw, double deposit) {
		this.balance = +deposit - withdraw;
	}

	@Override
	public String toString() {
		return "Account " + account + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}

}