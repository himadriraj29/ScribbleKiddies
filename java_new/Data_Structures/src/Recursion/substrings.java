package Recursion;

public class substrings {
	
	public static void Sub(String S, int i, String newS)
	{
		if(i==S.length())
		{
			System.out.println(newS);
			return;
		}
		char cc=S.charAt(i);
		//to be
		Sub(S,i+1,newS+cc);
		//not to be
		Sub(S,i+1,newS);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="him";
		Sub(S,0,"");

	}

}
