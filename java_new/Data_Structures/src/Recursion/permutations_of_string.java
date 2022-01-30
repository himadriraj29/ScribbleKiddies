package Recursion;

public class permutations_of_string {
	public static void permS(String S, String newS)
	{
		if(S.length()==0)
		{
			System.out.println(newS);
			return;
		}
			
		for(int i=0;i<S.length();i++)
		{
			char cc=S.charAt(i);
			String SS=S.substring(0,i)+S.substring(i+1);
			permS(SS, newS+cc);
		}
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="riya";
		permS(S,"");

	}

}
