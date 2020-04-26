import java.io.*;
import java.util.*;
class Main
{
	static int der(int n)
	{
		if (n == 1)
			return 0;
		if (n == 0)
			return 1;
		if (n == 2)
			return 1;
		return (n-1)*(der(n-1)+der(n-2));
		
	}
	public static void main(String[] args)throws IOException
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n<1 || n>100000)
			System.exit(0);
		System.out.println(der(n));

	}
}

