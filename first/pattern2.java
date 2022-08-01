package first;

class pattern2
{
	public static void main(String[] args)
	{
		int r,c;
		for(r=0;r<16;r++)
		{
			if(r>=0 && r<8)
			{
				for(c=0;c<15;c++)
				{
					System.out.print(" ");
				}
			}
			if(r>7 && r<15)
			{
				for(c=0;c<r-7;c++)
				{
					System.out.print("*");
				}
				for(c=r-7;c<7;c++)
				{
					System.out.print(" ");
				}
				for(c=7;c<21-r;c++)
				{
					System.out.print(" ");
				}
				for(c=21-r;c<14;c++)
				{
					System.out.print("*");
				}
			}
			if(r==15)
			{
				for(c=0;c<14;c++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}