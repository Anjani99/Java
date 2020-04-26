import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n<0 || n>50)
		{
			System.out.println("N not in range");
			System.exit(0);
		}
		int h[]=new int[n+1];
		int capa[]=new int[n+1];
		for(int i=0;i<n;i++)
		{
			int diameter_holes=scan.nextInt();
			if(diameter_holes<0 || diameter_holes>1000000000)
			{
				System.out.println("Diameter holes not in range");
				System.exit(0);
			}
			h[i]=diameter_holes;
			capa[i]=i+1;
		}
		int m=scan.nextInt();
		if(m<0 || m>1000)
		{
			System.out.println("M not in range");
			System.exit(0);
		}
		int b[]=new int[m+1];
		int res=0;
		int ctr=0;
		for(int i=0;i<m;i++)
		{
			ctr=0;
			int diameter_balls=scan.nextInt();
			if(diameter_balls<0 || diameter_balls>1000000000)
			{
				System.out.println("Diameter balls not in range");
				System.exit(0);
			}
			b[i]=diameter_balls;
			for(int j=n-1;j>=0;j--)
			{
				if(b[i]<=h[j] && capa[j]!=0)
				{
					System.out.print((j+1)+" ");
					capa[j]--;
					ctr=1;
					break;
				}
			}
			if(ctr==0)
			{
				System.out.print("0 ");
			}
		}
	}
}
