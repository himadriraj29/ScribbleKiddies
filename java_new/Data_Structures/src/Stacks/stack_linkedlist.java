package Stacks;

class Node
{ int data;       // integer data
    Node next;      // pointer to the next node
}
 
class Stackss
{
    private Node top;
 
    public Stackss() {
        this.top = null;
    }
 
    // Utility function to add an element `x` to the stack
    public void push(int x)        // insert at the beginning
    {
        // allocate a new node in a heap
        Node node = new Node();
 
		/*
		 * // check if stack (heap) is full. Then inserting an element would // lead to
		 * stack overflow if (node == null) { System.out.print("\nHeap Overflow");
		 * return; }
		 */
        System.out.println("Inserting " + x);
        if(top==null) {
        
        	node.next=null;
        	node.data=x;
        }
 
      
        else {
        	// set data in the allocated node
            node.data = x;
            // set the `.next` pointer of the new node to point to the current
            // top node of the list
            node.next = top;
        }
        
        // update top pointer
        top = node;
    }
 
    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return top == null;
    }
 
    // Utility function to return the top element of the stack
    public int peek()
    {
        // check for an empty stack
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("The stack is empty");
            return -1;
        }
    }
 
    // Utility function to pop a top element from the stack
    public void pop()        // remove at the beginning
    {
        // check for stack underflow
        if (top == null)
        {
            System.out.print("\nStack Underflow");
            return;
        }
 
        System.out.println("Removing " + peek());
 
        // update the top pointer to point to the next node
        top = (top).next;
    }
}

public class stack_linkedlist {
	public static void main(String[] args)
    {
        Stackss stack = new Stackss();
 
        stack.push(1);
        stack.push(2);
        stack.push(3);
 
        System.out.println("The top element is " + stack.peek());
 
        stack.pop();
        stack.pop();
        stack.pop();
 
        if (stack.isEmpty()) {
            System.out.print("The stack is empty");
        }
        else {
            System.out.print("The stack is not empty");
        }
    }
}



/*
  class MyStack 
{
    StackNode top;
    
    //Function to push an integer into the stack.
    void push(int a) 
    {
        if (top == null) 
        {
            top = new StackNode(a);
        } 
        else 
        {
            //creating a new temp node in the stack
            StackNode temp = new StackNode(a);
            //assigning link part of new node to top and making it top node.
            temp.next = top;
            top = temp;
        }
    }
    
    //Function to remove an item from top of the stack.
    int pop() 
    {
        StackNode temp = top;
        
        //if node at temp pointer is null, the stack is empty so we return -1.
        if (temp == null) 
        {
            return -1;
        } 
        else
        {
            //storing the data at top node and deleting that node.
            temp = temp.next;
            int r = top.data;
            top = temp;
            
            //returning the data.
            return r;
        }
    }
}

 */
