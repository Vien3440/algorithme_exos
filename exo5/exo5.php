<?php
//exercices on string
//by fflachet
//beweb

function palindrome($word)
{
	$flag = false;
	$i = 0;
	$j = strlen($word)-1;

	echo "$word\n";

	while ($i < strlen($word)) 
	{	
		if($word[$i] == $word[$j])
		{
			$j--;
			$i++;
			$flag = true;
		}
		else
		{
			$flag = false;
			break;
		}
	}
	if($flag == true)
		echo "ce mot est un palindrome\n";
	else
		echo "ce mot n'est pas un palindrome\n";
}


function countLetter($word)
{
	$i = 0;
	$nbLetter = 0;

	echo "$word\n";

	while($i < strlen($word))
	{
		if(ctype_alpha($word[$i]))
		{
			$nbLetter++;
			$i++;
		}
		else
		{
			$i++;
		}
	}
	echo "nombre de lettres alpha :$nbLetter\n";

}

function replaceLetter($word,$charA,$charB)
{
	$i = 0;

	echo "$word\n";

	while($i < strlen($word))
	{
		if($word[$i] == $charA)
		{
			$word[$i] = $charB;
		}
		$i++;
	}
	echo "la lettre $charA est remplacé par la lettre $charB\n resulat : $word\n";

}

function cutWord($text)
{
	$i = 0;
	$space = " "; 
	echo "$text\n";

	while($i < strlen($text))
	{
		if ($text[$i] == $space) 
		{
			$text[$i] = "\n";
		}
		$i++;
	}
	echo "$text\n";
}

function main($argv)
{
	$word = $argv[1];
	switch ($argv[2])
	{
		case '1':
			palindrome($word);
			break;
		case '2':
			countLetter($word);
			break;
		case '3':
			replaceLetter($word,$argv[3],$argv[4]);
			break;
		case '4':
			cutWord($word);
			break;
		default:
			echo "Try again\n";
			break;
	} 
}

main($argv);
?>