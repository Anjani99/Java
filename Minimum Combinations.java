import java.io.*;
import java.util.*;
class Main
{
	public static int Result(int a, int b)
	{
		if (a == 0)
		return b;

		return Result(b % a, a);
	}
	public static void main(String[] args)throws IOException
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		if(t<1 || t>1000)
			System.exit(0);
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			int n1=scan.nextInt();
			if(n<Math.pow(-10,7) || n>Math.pow(10,7))
				System.exit(0);
			System.out.println(Result(n1,n));
		}
	}
}

