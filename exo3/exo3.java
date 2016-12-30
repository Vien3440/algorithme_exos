//count letter
//by fflachet
//beweb

public class exo3
{
	public static void main(String[] args)
	{
		int count = 0;
		String word = args[0];
		String letter = args[1];

		for (int i=0; i < word.length(); i++)
	    {
	        if(word.charAt(i) == letter.charAt(0))
	        {
	    		count++;
	    	}
	    }
	System.out.println("le nombre de "+letter+" est :"+ count);
	}
}