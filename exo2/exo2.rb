#sort descending
#by fflachet
#beweb

$tab = [42,8,10,34,94,2,75,29]
$tmp = 0
$sorted = false

p $tab

while $sorted == false
    $i = 0
    $moved = 0

    while $i < $tab.length-1
        if $tab[$i] < $tab[$i+1]
            $tmp = $tab[$i+1]
            $tab[$i+1] = $tab[$i]
            $tab[$i] = $tmp
            $moved+=1
        end
        $i+=1
    end
    p $tab
    if $moved == 1
        $sorted = true
    end
end