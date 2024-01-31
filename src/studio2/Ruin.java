package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter start amount");
		int startAmount = in.nextInt();
		int currentMoney = startAmount;
		System.out.println("Enter win chance");
		double winChance = in.nextDouble();
		System.out.println("Enter win limit");
		int winLimit = in.nextInt();
		System.out.println("Enter total simulations");
		int totalSimulations = in.nextInt();
		double ruinCount  = 0;
		for(int day = 1; day<totalSimulations + 1; day++) {
			while(currentMoney < winLimit && currentMoney > 0) {
				if(Math.random() <= winChance) {
					currentMoney++;
				} else {
					currentMoney--;
				}
			}
			if(currentMoney == 0) {
				System.out.println("Day " + day + ": Ruin");
				ruinCount++;
			} if (currentMoney == winLimit) {
				System.out.println("Day " + day + ": Success");
			}
			currentMoney = startAmount;
		}
		System.out.println("Ruin rate:" + (ruinCount/totalSimulations));
	}
}
