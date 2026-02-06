package programs;

public class ArrayCommonElement {

	public static void main(String[] args) 
	{
		int a[]= {4,6,3,4,8,5};
		int b[]= {5,7,3,4,7,9};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}

}
