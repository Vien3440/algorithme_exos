//exercises on string
//by fflachet
//beweb

public class exo5
{
	public static void palindrome(String word)
	{
		boolean flag = false;
		int i = 0;
		int j = word.length()-1;

		System.out.println(word);

		while (i < word.length()-1)
		{	
			if(word.charAt(i) == word.charAt(j))
			{
				j--;
				i++;
				flag = true;
			}
			else
			{
				flag = false;
				break;
			}
		}
		if(flag == true)
		{
			System.out.println("ce mot est un palindrome");
		}
		else
		{
			System.out.println("ce mot n'est pas un palindrome");
		}
	}


	public static void countLetter(String word)
	{
		int i = 0;
		int nbLetter = 0;


		System.out.println(word);

		for( i = 0; i < word.length(); i++ )
		{
    		char temp = word.charAt(i);

    		if(Character.isLetter(temp))
    		{	
    			nbLetter++;
			}
		}
		System.out.println("nombre de lettres alpha : " +nbLetter);
	}

	public static void replaceLetter(String word,String charA,String charB)
	{
		int i = 0;

		System.out.println(word);

		while(i < word.length())
		{
			if(word.charAt(i) == charA.charAt(0))
			{
				 word = word.substring(0,i)+charB+word.substring(i+1);
			}
			i++;
		}
		System.out.println("la lettre "+charA+" est remplacé par la lettre "+charB); 
		System.out.println("resulat : "+word);
	}

	public static void cutText(String text)
	{
		int i = 0;

		System.out.println(text);

		while(i < text.length())
		{
			if(text.charAt(i) == ' ')
			{
				text = text.substring(0,i)+'\n'+text.substring(i+1);
			}
			i++;
		}
		System.out.println(text);
	}

	public static void main(String[] args)
	{
		String word = args[0];
		switch(args[1])
		{
			case "1":
				palindrome(word);
				break;
			case "2":
				countLetter(word);
				break;
			case "3":
				replaceLetter(word,args[2],args[3]);
				break;
			case "4":
				cutText(word);
				break;
			default:
				System.out.println("Try again");
				break;
		} 
		
	}
}