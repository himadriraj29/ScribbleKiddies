package Linked_list;

public class Main {
	
	Node head; //head of node
	public static class Node{
		int data;  // data int type ka h
		Node next;  //next node type ka h
		
		//constructor for creating a new node
		Node(int d){
			data=d;
			next=null;
		}
	}

	public static class LinkedList{
		Node head;
		Node tail;
		int size;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Empty linked list
		Main emptyList= new Main();
		
		//creating nodes
		emptyList.head= new Node(10);
		Node secondNode= new Node(20);
		Node thirdNode= new Node(30);
		
		//linking the created nodes with empty linked list
		emptyList.head.next=secondNode; //connecting 1st node with 2nd node
		emptyList.head.next.next=thirdNode; //connecting 2nd node with 3rd node
		
		//printing linked list items
		emptyList.printLinkedList();
		
	}
		//method for printing
		
		void printLinkedList() {
			Node tempNode=head;
			while(tempNode !=null) {
				System.out.println(tempNode.data + " ");
				tempNode= tempNode.next;
			}
		}

	}


