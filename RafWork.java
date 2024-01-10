package Linkedlist;
import java.util.Scanner;
public class RafWork {
	
				static Scanner sc = new Scanner(System.in);
				static int choice;
				
				static class Node{
					int info;
					Node next;
					Node(int info){
						this.info = info;
						this.next = null;
					}
				}
				static Node start = null;
				
				RafWork() {
					do {
						System.out.println("Press 1 to Traverse");
						System.out.println("Press 2 to Insertion");
						System.out.println("Press 3 to deletion");
						System.out.println("Press 4 to Exit");
						System.out.println("Enter your choice: ");
						choice = sc.nextInt();
						switch(choice) {
						case 1:
							Traverse_SLL();
							break;
						case 2:
							System.out.println("Press 1 for Insertion at First");
							System.out.println("Press 2 for Insertion at last");
							System.out.println("Press 3 for Insertion_InMiddle_BGN");
							System.out.println("Press 4 Insertion_InMiddle_AGN");
							System.out.println("Press 5 for Insertion_InMiddle_Exact_Mid_BGN_SLL");
							System.out.println("Press 6 for Insertion_InMiddle_Exact_Mid_AGN_SLL");
							System.out.println("Press 7 for Insertion_InSortedList_Ascending_SLL");
							System.out.println("Press 8 for Insertion_InSortedList_Descending_SLL");
							System.out.println("Enter your choice: ");
							int choice1 = sc.nextInt();
							
							System.out.println("Enter the item you went to insert: ");
							int item = sc.nextInt();
							switch(choice1) {
							case 1:
								Insertion_AtFirst_SLL(item);
								break;
							case 2:
								Insertion_AtLast_SLL(item);
								break;
							case 3:
								System.out.println("Enter the SItem: ");
								int SItem = sc.nextInt();
								Insertion_InMiddle_BGN(SItem,item);
								break;
							case 4:
								System.out.println("Enter the SItem: ");
								SItem = sc.nextInt();
								Insertion_InMiddle_AGN(SItem,item);
								break;
							case 5:
								Insertion_InMiddle_Exact_Mid_BGN_SLL(item);
								break;
							case 6:
								Insertion_InMiddle_Exact_Mid_AGN_SLL(item);
								break;
							case 7:
								Insertion_InSortedList_Ascending_SLL(item);
								break;
							case 8:
								Insertion_InSortedList_Descending_SLL(item);
								break;
							default:
								System.out.println("Invalid Input");
							}
							break;
						case 3:
							System.out.println("Press 1 to Deletion at first");
							System.out.println("Press 2 to Deletion at last");
							System.out.println("Press 3 to Deletion_InMiddle_SearchNode_SLL");
							System.out.println("Press 4 to Deletion_InMiddle_ExactMiddleNode_Sll");
							System.out.println("Enter your choice: ");
							choice = sc.nextInt();
							switch(choice) {
								case 1:
									Deletion_AtFirst_SLL();
									break;
								case 2:
									Deletion_AtLast_SLL();
									break;
								case 3:
									System.out.println("Enter the SItem to delete: ");
									int SItem = sc.nextInt();
									Deletion_InMiddle_SearchNode_SLL(SItem);
									break;
								case 4:
									Deletion_InMiddle_ExactMiddleNode_Sll();
									break;
								default:
									System.out.println("Invalid Input");
									}
								break;
						}
					}
					while(choice!=4);
				 }
				
	/**************************************************************/			
	/******************** Traverse Single Linkedlist ****************/		
	/**************************************************************/		
				
				static void Traverse_SLL() {
					System.out.println("Traverse");
				}
				
	/**************************************************************/			
	/******************** Insertion At first ****************/		
	/**************************************************************/		
		
				static void Insertion_AtFirst_SLL(int item) {
					System.out.println("Insertion at first");
				}
				
	/**************************************************************/			
	/******************** Insertion at last ****************/		
	/**************************************************************/		
		
				static void Insertion_AtLast_SLL(int item) {
					System.out.println("Insertion at last");
				}
				
	/**************************************************************/			
	/******************** Insertion In middle BGN ****************/		
	/**************************************************************/		
		
				static void Insertion_InMiddle_BGN(int SItem,int item) {
					
					System.out.println("Traverse");
					
				}
				
	/**************************************************************/			
	/******************** Insertion in Middle AGN ****************/		
	/**************************************************************/		
		
				static void Insertion_InMiddle_AGN(int SItem,int item) {
					
					System.out.println("Traverse");
				}
				
	/**************************************************************/			
	/******************** Insertion In Exact middle BGN ****************/		
	/**************************************************************/		
		
				static void Insertion_InMiddle_Exact_Mid_BGN_SLL(int item){
					System.out.println("Traverse");
				}
				
	/**************************************************************/			
	/******************** Insertion in Exact Middle AGN ****************/		
	/**************************************************************/		
		
				static void Insertion_InMiddle_Exact_Mid_AGN_SLL(int item){
					System.out.println("Traverse");
				}
				
	/**************************************************************/			
	/******************** Insertion in sorted ascending ****************/		
	/**************************************************************/		
		
				static void Insertion_InSortedList_Ascending_SLL(int item) {
					System.out.println("Traverse");
				}
				
	/**************************************************************/			
	/******************** Insertion in sorted descending ****************/		
	/**************************************************************/		
		
				static void Insertion_InSortedList_Descending_SLL(int item) {
					System.out.println("Traverse");
				}
				
	/**************************************************************/			
	/******************** Deletion At first ****************/		
	/**************************************************************/		
		
				static void Deletion_AtFirst_SLL() {
					System.out.println("Traverse");
				}
				
	/**************************************************************/			
	/******************** Deletion at last ****************/		
	/**************************************************************/		
		
				static void Deletion_AtLast_SLL() {
					System.out.println("Traverse");
				}
				
	/**************************************************************/			
	/******************** Deletion at last ****************/		
	/**************************************************************/		
		
				static void Deletion_InMiddle_SearchNode_SLL(int SItem) {
					System.out.println("Traverse");
				}
				
	/**************************************************************/			
	/******************** Deletion at Exact Middle ****************/		
	/**************************************************************/		
			
				static void Deletion_InMiddle_ExactMiddleNode_Sll() {
					System.out.println("Traverse");
				}	

}
