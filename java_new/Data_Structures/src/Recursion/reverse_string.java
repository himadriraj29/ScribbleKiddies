package Recursion;

public class reverse_string {
	
	public static void reverseS(String S,int i) 
	{
		if(i==0)
		{
			System.out.print(S.charAt(i));
			return;
		}
		System.out.print(S.charAt(i));
		reverseS(S,i-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="himadri";
		reverseS(S,S.length()-1);
		

	}

}
