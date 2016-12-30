<?php
//sort descending
//by fflachet
//beweb

$tab = array(42,8,10,34,94,2,75,29);
$tmp = 0;
$sorted = false;
$tabLength = count($tab)-1;

print_r($tab);

while($sorted == false)
{
    $i = 0;
    $moved = 0;

    while($i < $tabLength)
    {
        if($tab[$i] < $tab[$i+1])
        {
            $tmp = $tab[$i+1];
            $tab[$i+1] = $tab[$i];
            $tab[$i] = $tmp;
            $moved++;
        }
        $i++;
    }
    print_r($tab);
    if($moved == 1)
    {
        $sorted = true;
    }
}
?>