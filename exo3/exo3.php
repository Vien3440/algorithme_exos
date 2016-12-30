<?php
// count letter
// by fflachet
// beweb

$result = 0;
$i = 0;

function countLetter($word,$letter)
{
	$result = 0;
	$i = 0;
	$argv[1] = $word;
	$argv[2] = $letter;

	echo "$word\n";

	while($i < strlen($word))
	{
		if($word[$i] == $letter)
		{
			$result++;
		}
	$i++;
	}
	echo "le nombre de $letter est : $result\n";
}

countLetter($argv[1], $argv[2])
?>
