import java.util.Scanner;
class PrintEx
{
	public static void main(String[] args)
	{	
		/*reads int nd if need to read a nextline string add sc.nextLine();
		so that it dont get terminate if any white space encounters*/
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		float b=sc.nextFloat();
		double d=sc.nextDouble();
		System.out.println(a);
		System.out.println(s);
		System.out.println(b);
		System.out.println(d);

	}
}