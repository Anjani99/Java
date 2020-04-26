import java.util.*;
import java.util.Arrays;
class Main
{
	public static void display(int answer)
	{
		System.out.println(answer);
	}
	//check char arrays
	public static boolean CheckArrays(String original, String duplicate)
	{
		char a[]=original.toCharArray();
		char b[]=duplicate.toCharArray();
		int f=0;
		for(int i=0;i<original.length();i++)
		{
			if(a[i]==b[i])
				f+=1;
		}
		if(original.length()==f)
			return true;
		else
			return false;
	}
	//convert array to string
	public static String ToString(char[] ch)
	{
		String ret="";
		for(char c:ch)
			ret+=c;
		return ret;
	}
	public static void find(int numbers[],String original)
	{
		String duplicate="";
		char change[]=original.toCharArray();
		int answer=1;
		int loopings=0;
		while(loopings==0)
		{
			char[] tc=new char[numbers.length];
			for(int i=0;i<numbers.length;i++)
			{
				tc[numbers[i]]=change[i];
			}
			change=tc;
			duplicate=ToString(change);
			//System.out.println(original+" "+duplicate);
			if(CheckArrays(original, duplicate)==true)
				loopings=1;
			else
				answer+=1;
		}
		display(answer);
	}
	public static void convert_to_char(int[] list)
	{
		int length=list.length;
		char cha='a';
		char ch[]=new char[length];
		for(int i=0;i<length;i++)
		{
			ch[i]=cha;
			cha++;
		}
		find(list,ToString(ch));
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		//int t=scan.nextInt();
		int t=1;
		if(t<1 || t>10)
		{
			System.exit(0);
		}
		for(int tc=0;tc<t;tc++)
		{
			int n=scan.nextInt();
			//int n=6;
			if(n<1 || n>10000)
				System.exit(0);
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				int x=scan.nextInt();
				if(x<1 || x>n)
					System.exit(0);
				arr[i]=x-1;
			}
			//int arr[]={2, 5, 4, 3, 0, 1};
			
			convert_to_char(arr);
		}
	}
}
