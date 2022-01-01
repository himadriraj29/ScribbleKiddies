package Recursion;

import java.util.ArrayList;

public class unique_substring {
	static ArrayList<String> Answer = new ArrayList<>();
	public static void Sub(String S, int i, String newS)
	{

	if(i==S.length())
	{	
		if(Answer.contains(newS))
			return;
		Answer.add(newS);
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
		String S="hiiim";
		Sub(S,0,"");

	}


}
