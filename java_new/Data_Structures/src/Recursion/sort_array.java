package Recursion;

public class sort_array {

	public static boolean sortA(int A[],int i)
	{
		if(i==A.length-1)
		{
			return true;
		}
		if(A[i]<A[i+1])
		{
			return sortA(A,i+1);
		}
		else
		{
			return false;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= { 1,2,3};
		System.out.print(sortA(A,0));
	}

}
