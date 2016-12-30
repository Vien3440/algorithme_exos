//exercises on string
//by fflachet
//beweb

import java.util.Scanner;

public class exo7
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
		Scanner input = new Scanner(System.in);
		boolean drapeau = false;
		System.out.println("Bonjour,");
		while(drapeau == false)
		{
			System.out.println("Veuillez entrer une phrase ou un mot :\n");

			String word = input.nextLine();

			System.out.println("Veuillez choisir une action a effectuer\nTapez 1 pour verifier si le mot ou phrase est un palindrome\nTapez 2 pour nombres de caractere alphabetique dans le mot ou phrase\nTapez 3 pour remplacer un caractere par un autre\nTapez 4 pour decouper la phrase\nTapez 5 pour resaisir le mot ou la phrase a traiter\nTapez q pour quitter\n");

			String mode = input.nextLine();

			switch(mode)
			{
				case "1":
					palindrome(word);
					break;
				case "2":
					countLetter(word);
					break;
				case "3":
					System.out.println("Veuillez entrez la lettre a modifier");
					String charA =input.nextLine();
					System.out.println("Veuillez entrez la nouvelle lettre");
					String charB =input.nextLine();
					replaceLetter(word,charA,charB);
					break;
				case "4":
					cutText(word);
					break;
				case "5":
					break;
				case "q":
					System.exit(0);
					break;
				default:
					System.out.println("Try again");
					break;
			} 
		}
	}
}