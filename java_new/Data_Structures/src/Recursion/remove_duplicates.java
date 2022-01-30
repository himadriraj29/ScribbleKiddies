package Recursion;

public class remove_duplicates {
	public static boolean[] map=new boolean[26];
	public static void removeDup(String S, int i, String newS) 
	{
		if(i==S.length())
		{
			System.out.println(newS);
			return;
		}
		char cc= S.charAt(i) ;
		if(map[cc-'a']==true)
		{
			removeDup(S,i+1,newS);
		}
		else
		{
			newS +=cc;
			map[cc-'a']=true;
			removeDup(S,i+1,newS);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="ababababcdefaabde";
		removeDup(S,0,"");
		
	}

}
