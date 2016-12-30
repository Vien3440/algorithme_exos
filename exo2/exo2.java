//sort descending
//by fflachet
//beweb

import java.util.Arrays;

public class exo2
{
	public static void main(String[] args)
	{
		int[] tab = {42,8,10,34,94,2,75,29};
		int tmp = 0;
		int i = 0;
		boolean sorted = false;
		int moved = 0;

		System.out.println(Arrays.toString(tab));
		while(sorted == false)
		{
			i = 0;
			moved = 0;

			while(i < tab.length-1)
			{
				if(tab[i] < tab[i+1])
				{
					tmp = tab[i+1];
					tab[i+1] = tab[i];
					tab[i] = tmp;
					moved++;
				}
				i++;
			}
			System.out.println(Arrays.toString(tab));
			if(moved == 1)
			{
				sorted = true;
			}
		}
	}
}
