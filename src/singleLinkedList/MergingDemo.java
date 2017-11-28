package singleLinkedList;

public class MergingDemo {

	public static void main(String[] args) {

		SingleLinkedList list1 = new SingleLinkedList();
		SingleLinkedList list2 = new SingleLinkedList();
		
		list1.createList();
		list2.createList();
		
		list1.bubbleSortExchData();
		list2.bubbleSortExchData();
		
		System.out.print("First List  :"); list1.displayList(); System.out.println("\n");
		System.out.print("Second List :"); list2.displayList(); System.out.println("\n");
		
		System.out.print("Merged List :");
		//SingleLinkedList list3 = list1.merge1(list2);
		
		SingleLinkedList list3 = list1.merge2(list2);
		
		list3.displayList();

	}

}
