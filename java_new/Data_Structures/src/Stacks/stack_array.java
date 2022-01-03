package Stacks;


 public class stack_array 
{
	private int arr[];
    private int top;
    private int capacity;
 
    // Constructor to initialize the stack
    stack_array(int size)
    {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    
 // Utility function to add an element `x` to the stack
    public int push(int x)
    {
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated\n");
            //System.exit(1);
        }
        else 
 
        // System.out.println("Inserting " + x);
        arr[++top] = x;
        
		return x;
    }
 
    // Utility function to pop a top element from the stack
    public int pop()
    {
        // check for stack underflow
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            //System.exit(1);
        }
 
        System.out.println("Removing " + peek());
 
        // decrease stack size by 1 and (optionally) return the popped element
        return arr[top--];
    }
    
 // Utility function to return the top element of the stack
    public int peek()
    {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(1);
        }
 
        return -1;
    }
 
    // Utility function to return the size of the stack
    public int size() {
        return top + 1;
    }
 
    // Utility function to check if the stack is empty or not
    public boolean isEmpty()
    {
        return top == -1;               // or return size() == 0;
    }
 
    // Utility function to check if the stack is full or not
    public boolean isFull() {
        return top == capacity - 1;     
    	//return size() == capacity;
    }


//public class stack_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stack_array sta = new stack_array(3);
		 
        sta.push(1);      // inserting 1 in the stack
        sta.push(2);      // inserting 2 in the stack
 
        sta.pop();        // removing the top element (2)
        sta.pop();        // removing the top element (1)
 
        sta.push(3);      // inserting 3 in the stack
 
        System.out.println("The top element is " + sta.peek());
        System.out.println("The stack size is " + sta.size());
 
        sta.pop();        // removing the top element (3)
 
        // check if the stack is empty
        if (sta.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
	}

}
