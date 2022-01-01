package Recursion;

public class matrix_maze {
	public static void move( int i, int j, int m, int n,String ans) 
	{
		if(i==m && j==n)
		{
			System.out.println(ans);
			return;
		}
		
		if(i>m ||j>n)
			return;
		
		//move(i+1,j+1,m,n,ans); //diagonally
		move(i+1,j,m,n,ans+'D');
		move(i,j+1,m,n,ans+'R');
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	move(0,0,4,5,"");

	}

}
