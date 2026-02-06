package programs;

public class FibonacciSeries {

	public static void main(String[] args)
	{
		int prev=0,next=1;
		int sum;
		System.out.print(prev+" "+next+" ");
		
		for(int i=1;i<=8;i++)
		{
			sum=prev+next;
			System.out.print(sum+" ");
			prev=next;
			next=sum;
		}
	}

}
