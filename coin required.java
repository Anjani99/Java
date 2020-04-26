import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int one=0;
		int two=0;
		int five=0;
		int number=scan.nextInt();
		if(number<0 || number>100000)
		{
			System.out.println("n not in range");
			System.exit(0);
		}
		int original=number;
		int duplicate=number;
		while(((duplicate-4)%5)!=0)
		{
			duplicate--;
		}
		//count five rupees
		five=(duplicate-4)/5;
		if(five<0)
			five=0;
		//count one rupees
		number=number-(5*five);
		if(number%2==0)
		{
			one=2;
		}
		else
		{
			one=1;
		}
		//count two rupees
		two=(original-(one+(5*five)))/2;
		int total_rupees=one+two+five;
		System.out.println(total_rupees+" "+five+" "+two+" "+one);
	}
}
