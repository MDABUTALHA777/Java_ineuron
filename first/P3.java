package first;

class P3
{
	public static void main(String[] args)
	{
		int r,c;
		for(r=0;r<=13;r++)
		{
			if(r==0)
			{
				for(c=7;c<=14;c++)
				{
					System.out.print("*");
				}
			}
			for(c=0;c<7-r;c++)
			{
				System.out.print("*");
			}
			if(r>0 && r<7)
			{
			for(c=7-r;c<7;c++)
			{
				System.out.print(" ");
			}
			}
			if(r>0 && r<7)
			{ for (c=7;c<15;c++)
				{
				System.out.print(" ");
			}}
			if(r>6 && r<13)
			{
			for(c=0;c<r-5;c++)
			{
				System.out.print("*");
			}
			
			for(c=r-5;c<7;c++)
			{
				System.out.print(" ");
			}
			}
			if(r>6 && r<13)
			{
				for(c=7;c<15;c++)
				{
					System.out.print(" ");
				}
			}
			if(r==13)
			{
				for(c=0;c<15;c++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}