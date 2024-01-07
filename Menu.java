package Linkedlist;
//Ya Zehra sa

import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Press 1 for Single linkedlist.");
			System.out.println("Press 2 for double linkedlist.");
			System.out.println("Enter your choice");
			System.out.println("Press 3 for exit.");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				Single_linkedlist sll = new Single_linkedlist();
				break;
			case 2:
				Double_linkedlist dll = new Double_linkedlist();
				break;
			}
		}
		while(choice!=3);

	}

}
