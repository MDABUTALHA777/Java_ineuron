package first;

class pattern
{
	public static void main(String[] args)
	{
		int r,c;
		for(r=0;r<14;r++)
		{
			for(c=0;c<7-r;c++)
			{
				System.out.print("*");
			}
			if(r>0 && r<7)
			{
				for(c=6-r;c<7;c++)
				{
					System.out.print(" ");
				}
			}
			if(r==0)
				{
					for(c=7;c<15;c++)
					{
						System.out.print("*");
					}
				}
			if(r>0 && r<7)
			{
				for(c=6+r;c<14;c++)
				{
					for(c=7;c<6+r;c++)
					{
						System.out.print(" ");
					}
					for(c=6+r;c<14;c++)
					{
						System.out.print("*");
					}
				}
			}
			if(r>6 && r<13)
			{
				for(c=0;c<15;c++)
				{
					if(c==0)
					{
						System.out.print("*");
					}
					else
					{
						if(c==14)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
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