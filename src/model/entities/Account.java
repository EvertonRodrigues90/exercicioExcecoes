package model.entities;

public class Account {

		private Integer number;
		private String holder;
		private double balance;
		private Double withdrawLimit;
		
		
		public Account() {
			
		}
		
		public Account(Integer number, String holder, double initialBalance, Double withdrawLimit) {
			this.number = number;
			this.holder = holder;
			deposit(initialBalance);
			this.withdrawLimit = withdrawLimit;
		}

		public Integer getNumber() {
			return number;
		}

		public void setNumber(Integer number) {
			this.number = number;
		}

		public String getHolder() {
			return holder;
		}

		public void setHolder(String holder) {
			this.holder = holder;
		}

		public Double getBalance() {
			return balance;
		}


		public Double getWithdrawLimit() {
			return withdrawLimit;
		}


		public void deposit(Double amount) {
			balance += amount;
		}
		
	
		public void withdraw(Double amount) {
			if(amount > balance) {
				throw new IllegalArgumentException("Withdraw error: Not enough balance");
			}
			else if(amount > withdrawLimit) {
				throw new IllegalArgumentException("Withdraw error: The amount exceeds withdraw limit");
			}
			else {
			this.balance -= amount;
			}
		}
}
