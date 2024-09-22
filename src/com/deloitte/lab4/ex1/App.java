package com.deloitte.lab4.ex1;



class Person{
	private String name;
	private float age;
	
	public Person() {
		super();
	}

	public Person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}
	
}

class Account{
	private long accNum;
	private double balance;
	private Person accHolder;
	
	public Account() {
		super();
	}

	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	//Methods
	public void deposit(double amt) {
		double val = this.getBalance() + amt;
		this.setBalance(val);
	}
	
	public void withdraw(double amt) {
		double val = this.getBalance() - amt;
		this.setBalance(val);
	}
	
	
}

public class App {
	public static void main(String[] args) {
		Person p1 = new Person("Smith", 24.5f);
		Person p2 = new Person("Kathy", 36.4f);
		
		Account smith = new Account(101, 3000.0, p1);
		Account kathy = new Account(102, 3000.0, p2);
		
		smith.deposit(2000);
		kathy.withdraw(2000);
		
		System.out.println("Updated balance of smith: "+smith.getBalance());
		System.out.println("Updated balance of Kathy: "+kathy.getBalance());
	}
}