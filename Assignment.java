import java.util.*;
class Assignment
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Demo d = new Demo();
		d.game();
	}
}
class Demo
{
	public void game()
	{
		Scanner sc = new Scanner(System.in);
		int played;
		for(played=0;;played++)
		{
			String plyr1,plyr2;
			System.out.println("WELCOME TO THE GAME");
			System.out.print("\n ENTER PLAYER 1 NAME:");
			plyr1 = sc.nextLine();
			System.out.print("\n ENTER PLAYER 2 NAME:");
			plyr2 = sc.nextLine();
			System.out.print("\n Initial number of stones:");
			int init = sc.nextInt();
			System.out.print("\n Max no. of stones removed at once:");
			int bond = sc.nextInt();
			if(bond <= init)
			{
				int stone;
				for(stone=1; stone<=init; stone++)
				{
					System.out.print(" * ");
				}
				int i;
				for(i=init; i>=0; i--)
				{
					System.out.print("\n Number of stones to be removed by " + plyr1 +":");
					int a = sc.nextInt();
					if(a <= bond)
					{
						System.out.print( a +" stones are removed\n");
						for(stone=1; stone<=init-a; stone++)
						{
							System.out.print(" * ");
						}
						init -= a;
						if(init == 0)
						{
							System.out.println("WINNER IS: " + plyr1);
							break;
						}
					}
					else
					{
						System.out.println("Out of the bond");
						break;
					}
					System.out.print("\n Number of stones to be removed by " + plyr2 +":");
					int b = sc.nextInt();
					if(b <= bond)
					{
						System.out.print( b +" stones are removed\n");
						for(stone=1; stone<=init-b; stone++)
						{
							System.out.print(" * ");
						}
						init -= b;
						if(init == 0)
						{
							System.out.println("WINNER IS: " + plyr2);
							break;
						}
					}
					else
					{
						System.out.println("Out of the bond");
						break;
					}
				}
				System.out.println("(((((GAME OVER)))))");
			}
			else
			{
				System.out.println("Invalid bond and initialize number");
			}
			System.out.println("Want to play again? (Y/N):");
			char confirm = sc.next().charAt(0);
			if(confirm == N)
			{
				break;
			}
		}	
	}
}