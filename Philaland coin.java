import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args)throws IOException
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		if(t<1 || t>100)
		{
			System.out.println("T not in range");
			System.exit(0);
		}
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			if(n<1 || n>5000)
			{
				System.out.println("N not in range");
				System.exit(0);
			}
			int x=0;
			while(Math.pow(2,x)<=n)
			{
				x++;
			}
			System.out.println(x);
		}
	}
}

