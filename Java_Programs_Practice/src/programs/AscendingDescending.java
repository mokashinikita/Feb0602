package programs;

public class AscendingDescending {

	public static void main(String[] args) 
	{
		int a[]= {3,6,7,55,4,8,66,4,33,567,76};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			System.out.print(a[i]+" ");
		}
	}

}
