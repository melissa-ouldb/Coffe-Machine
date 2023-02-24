package miniprojects;

import java.util.Scanner;

public class CoffeeMchine {
	static Scanner scanner= new Scanner(System.in);
	private static int water=400,milk=540,beans=120,cups=9,money=550;
	private static int waterFill=0,milkFill=0,beansFill,cupsFill=0;
	private static String input="";
	
	// main menu 
	 static void menu() {
		    input= scanner.nextLine();
			if(input.equals("buy")) {
				System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
				String coffee=scanner.nextLine();
				coffee(coffee);
			}
			else if(input.equals("fill")) {
				filling();
			}
			else if(input.equals("take")) {
				System.out.println("I gave you $"+money);
				money=0;
				System.out.println("Write action (buy, fill, take, remaining, exit): ");
			}
			else if(input.equals("remaining")) {
				display();
			}		
	}
	 
	 // displaying the remaining ingrediants
	 static void display() {
		System.out.println("The coffee machine has:");
		System.out.printf("%d ml of water\n",water);
		System.out.printf("%d ml of milk\n",milk);
		System.out.printf("%d g of coffee beans\n",beans);
		System.out.printf("%d disposable cups\n",cups);
		System.out.printf("$%d of money\n",money);
		System.out.println("Write action (buy, fill, take, remaining, exit): ");
	}
	
	 // checking the availability of the ingrediants & making coffee
	 static void coffee(String coffee) {
		if(coffee.equals("1")) {
			if(250<=water && 16<=beans && 1<=cups ){
			System.out.println("I have enough resources, making you a coffee!");
			water=water-250;
			beans=beans-16;
			money=money+4;
			cups--;
			}
			else {
				if(water<250) {System.out.println("Sorry, not enough water!");}
				if(beans<16) {System.out.println("Sorry, not enough coffee beans!");}
				if(cups<1) {System.out.println("Sorry, not enough cups!");}
			}
		}
		else if(coffee.equals("2")) {
			if(water>=350 && milk>=75 && beans>=20 && cups>=1 ){
			System.out.println("I have enough resources, making you a coffee!");
			water=water-350;
			milk=milk-75;
			beans=beans-20;
			money=money+7;
			cups--;
			}
			else {
				if(water<350) {System.out.println("Sorry, not enough water!");}
				if(milk<75) {System.out.println("Sorry, not enough milk!");}
				if(beans<20) {System.out.println("Sorry, not enough coffee beans!");}
				if(cups<1) {System.out.println("Sorry, not enough cups!");}
			}
		}
		else if(coffee.equals("3")) {
			if(water>=350 && milk>=75 && beans>=20 && cups>=1 ){
			System.out.println("I have enough resources, making you a coffee!");
			water=water-200;
			milk=milk-100;
			beans=beans-12;
			money=money+6;
			cups--;
			}
			else {
				if(water<200) {System.out.println("Sorry, not enough water!");}
				if(milk<100) {System.out.println("Sorry, not enough milk!");}
				if(beans<12) {System.out.println("Sorry, not enough coffee beans!");}
				if(cups<1) {System.out.println("Sorry, not enough cups!");}
			}
		}
		else if(coffee.equals("back")) {	
		}
		System.out.println("Write action (buy, fill, take, remaining, exit): ");
	}
	 
	// filling the machine 
	 static void filling() {
		System.out.println("Write how many ml of water you want to add:");
		waterFill= scanner.nextInt();
		water=water+waterFill;
		System.out.println("Write how many ml of milk you want to add:");
		milkFill=scanner.nextInt();
		milk=milk+milkFill;
		System.out.println("Write how many grams of coffee beans you want to add: ");
		beansFill=scanner.nextInt();
		beans=beans+beansFill;
		System.out.println("Write how many disposable cups you want to add: ");
		cupsFill=scanner.nextInt();
		cups=cups+cupsFill;
		System.out.println("Write action (buy, fill, take, remaining, exit): ");
	}
	
	public static void main(String[] args) {
		System.out.println("Write action (buy, fill, take, remaining, exit): ");
		while(!input.equals("exit")) {
			menu();	
	}
	}
}
