package Recursion;

public class move_x_to_end_of_string {
	
	public static void movex(String S,int i,int count, String newS)
	{
		if(i==S.length())
		{
			System.out.println(newS);
			return;
		}
		char cc=S.charAt(i);
		if (cc=='x')
		{
		count++;
		movex(S, i+1,count, newS);
		}
		else
		{
		newS +=cc;
		movex(S, i+1,count, newS);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="abcxxbcxxdefxh";
		movex(S, 0,0, "");
	}
}
