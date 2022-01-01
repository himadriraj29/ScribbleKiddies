package Linked_list;
import java.io.*;
import java.util.*;
import Linked_list.Main.Node;

public class add_last {
	public static class Node{
		int data;  // data int type ka h
		Node next;  //next node type ka h
	}

	public static class LinkedList{
		Node head;
		Node tail;
		int size;
		
		void addlast(int val) {
			
			Node temp=new Node(); //we are doing these three lines here instead of in if and else
			temp.data=val;
			temp.next=null;
			
			if(size==0) {
				
			/*Node temp=new Node();
			temp.data=val;
			temp.next=null; */
			
			head=tail=temp;
			
			//size++;
			}
			
			else
			{
				/*Node temp=new Node();
				temp.data=val;
				temp.next=null; */
				
				tail.next=temp;
				tail=temp;
				//size++;
			}
			size++; //we are doing it here instead of in if else
		}
	}
	public static void testList(LinkedList list) {}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	}

}

/* Scanner myObj = new Scanner(System.in);// Create a Scanner object
		System.out.println("Enter the size of array:  ");
		int n = myObj.nextInt(); */
