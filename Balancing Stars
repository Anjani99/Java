import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.*;
class Main
{
	static HashMap<Character, Character> bMap;
	
	static
	{
		bMap=new HashMap<>();
		bMap.put('(',')');
		bMap.put('[',']');
		bMap.put('{','}');
	}
	static String isBalanced(String str)
	{
		int count=0;
		String no="";
		char chs[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
			chs[i]=str.charAt(i);
		
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			char ch=chs[i];
			if(bMap.containsKey(ch))
			{
				stack.push(ch);
				count+=1;
			}
			else if(stack.isEmpty() || ch!=bMap.get(stack.pop()))
			{
				no="No";
			}
		}
		if(no=="No")
			return "No "+count;
		String ret="Yes "+count;
		return stack.isEmpty()?ret:"No "+count;
	}
	public static String RemoveUnwanted(String s)
	{
		String ret="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if( c=='(' || c==')' || c=='[' || c==']' || c=='{' || c=='}')
			{
				ret+=c;
			}
		}
		return ret;
	}
	public static void main(String args[]) throws IOException
	{
		Scanner scanner=new Scanner(System.in);
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		String s=scanner.nextLine();
		if(s.length()<4 || s.length()>1000)
			System.exit(0);
		String ss=RemoveUnwanted(s);
		String result=isBalanced(ss);
		System.out.println(result);
	}
}
