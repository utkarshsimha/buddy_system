
import java.util.Random;
import java.util.Scanner;
import java.awt.*;   
import javax.swing.*;
public class Client
{
	final int size = 1024;
	public static void main( String args[] )
	{
		Scanner in = new Scanner(System.in);
		Tree t = null;
		Random rn = new Random();
		DrawTest dt = new DrawTest();
		int num;
		try {
			t = new Tree( size, 500, 10 );
		} catch (NotPowerOfTwoException e) {
			e.printStackTrace();
		}
		while(true)
		{
			if(t != null )
			{
				try {
					// int rand_int = rn.nextInt( size );
					// System.out.println("Random number : "+rand_int);
					num = in.nextInt();
					if(num == -1)
						break;
					t.requestMem( num );
					System.out.println("------------------------------------------------------------------");
				} catch (NotEnoughMemoryException e) {
					e.printStackTrace();
				}
			}
		}
		if(t!=null)
		{
			dt.createFrame(t.list);
		}
	}
}
