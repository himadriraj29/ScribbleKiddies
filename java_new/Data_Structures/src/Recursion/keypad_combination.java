package Recursion;

public class keypad_combination {
	public static String[] keypad= {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	
	public static void combinations(String S, int ind, String comb)
	{
		if(ind==S.length())
		{
			System.out.println(comb);
			return;
		}
		char cc=S.charAt(ind);
		String newS=keypad[cc-'0'];
		
		for(int i=0; i<newS.length();i++) 
		{
			combinations(S,ind+1,comb+newS.charAt(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="24";
		combinations(S,0,"");

	}

}
